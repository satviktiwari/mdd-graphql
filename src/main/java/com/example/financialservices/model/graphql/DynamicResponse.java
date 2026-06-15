package com.example.financialservices.model.graphql;

import java.util.List;

public class DynamicResponse {
    private String apiName;
    private String description;
    private int totalRows;
    private List<DynamicRow> rows;

    public DynamicResponse(String apiName, String description, List<DynamicRow> rows) {
        this.apiName     = apiName;
        this.description = description;
        this.totalRows   = rows.size();
        this.rows        = rows;
    }

    public String getApiName()      { return apiName; }
    public String getDescription()  { return description; }
    public int getTotalRows()       { return totalRows; }
    public List<DynamicRow> getRows() { return rows; }
}