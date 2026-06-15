package com.example.financialservices.service;

import com.example.financialservices.exception.ApiNotFoundException;
import com.example.financialservices.model.ApiMetadata;
import com.example.financialservices.model.ColumnMapping;
import com.example.financialservices.model.graphql.ApiInfo;
import com.example.financialservices.model.graphql.DynamicResponse;
import com.example.financialservices.model.graphql.DynamicRow;
import com.example.financialservices.model.graphql.Field;
import com.example.financialservices.repository.ApiMetadataRepository;
import com.example.financialservices.repository.ColumnMappingRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class DynamicApiService {

    private final ApiMetadataRepository metaRepo;
    private final ColumnMappingRepository colRepo;
    private final JdbcTemplate jdbc;  // ← raw SQL executor, no POJO needed

    public DynamicApiService(ApiMetadataRepository metaRepo,
                             ColumnMappingRepository colRepo,
                             JdbcTemplate jdbc) {
        this.metaRepo = metaRepo;
        this.colRepo  = colRepo;
        this.jdbc     = jdbc;
    }

    public List<Map<String, Object>> execute(String apiName) {

        // 1. Look up metadata
        ApiMetadata meta = metaRepo
                .findByApiNameAndIsActive(apiName, true)
                .orElseThrow(() -> new ApiNotFoundException("No active API found: " + apiName));

        // 2. Get visible columns in display order
        List<ColumnMapping> columns = colRepo
                .findByApiIdAndIsVisibleOrderByDisplayOrder(meta.getId(), true);

        // 3. Execute the stored SQL
        List<Map<String, Object>> rawRows = jdbc.queryForList(meta.getSqlQuery());

        // 4. Reshape each row: DB column name → display name, typed correctly
        return rawRows.stream()
                .map(row -> reshapeRow(row, columns))
                .toList();
    }

    private Map<String, Object> reshapeRow(Map<String, Object> raw,
                                           List<ColumnMapping> columns) {
        // LinkedHashMap preserves display_order
        Map<String, Object> shaped = new LinkedHashMap<>();
        for (ColumnMapping col : columns) {
            Object value = raw.get(col.getColumnName().toUpperCase()); // H2 uppercases keys
            shaped.put(col.getDisplayName(), castValue(value, col.getDataType()));
        }
        return shaped;
    }

    private Object castValue(Object value, String dataType) {
        if (value == null) return null;
        return switch (dataType) {
            case "NUMBER"  -> value;  // already Number from JDBC
            case "BOOLEAN" -> value;  // already Boolean from JDBC
            case "DATE"    -> value.toString();  // LocalDate → String
            default        -> value.toString();  // STRING
        };
    }

    public DynamicResponse executeForGraphQL(String apiName) {

        // Reuse existing metadata lookup
        ApiMetadata meta = metaRepo
                .findByApiNameAndIsActive(apiName, true)
                .orElseThrow(() -> new ApiNotFoundException("No active API: " + apiName));

        List<ColumnMapping> columns = colRepo
                .findByApiIdAndIsVisibleOrderByDisplayOrder(meta.getId(), true);

        List<Map<String, Object>> rawRows = jdbc.queryForList(meta.getSqlQuery());

        // Convert each raw row → DynamicRow(List<Field>)
        List<DynamicRow> dynamicRows = rawRows.stream()
                .map(row -> {
                    List<Field> fields = columns.stream()
                            .map(col -> {
                                Object val = row.get(col.getColumnName().toUpperCase());
                                return new Field(
                                        col.getDisplayName(),
                                        val != null ? val.toString() : null
                                );
                            })
                            .toList();
                    return new DynamicRow(fields);
                })
                .toList();

        return new DynamicResponse(meta.getApiName(), meta.getDescription(), dynamicRows);
    }

    public List<ApiInfo> listApis() {
        return metaRepo.findByIsActive(true).stream()
                .map(meta -> new ApiInfo(
                        meta.getApiName(),
                        meta.getDescription(),
                        meta.getSourceTable(),
                        colRepo.countByApiId(meta.getId())
                ))
                .toList();
    }
}