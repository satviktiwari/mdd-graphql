package com.example.financialservices.model;

import jakarta.persistence.*;

@Entity
@Table(name = "column_mapping")
public class ColumnMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "api_id", nullable = false)
    private Long apiId;

    @Column(name = "column_name", nullable = false)
    private String columnName;

    @Column(name = "display_name", nullable = false)
    private String displayName;

    @Column(name = "data_type", nullable = false)
    private String dataType;

    @Column(name = "is_nullable")
    private Boolean isNullable = true;

    @Column(name = "display_order")
    private Integer displayOrder = 0;

    @Column(name = "is_visible")
    private Boolean isVisible = true;

    public ColumnMapping() {}

    public ColumnMapping(Long id, Long apiId, String columnName, String displayName,
                         String dataType, Boolean isNullable, Integer displayOrder,
                         Boolean isVisible) {
        this.id = id;
        this.apiId = apiId;
        this.columnName = columnName;
        this.displayName = displayName;
        this.dataType = dataType;
        this.isNullable = isNullable;
        this.displayOrder = displayOrder;
        this.isVisible = isVisible;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getApiId() { return apiId; }
    public void setApiId(Long apiId) { this.apiId = apiId; }

    public String getColumnName() { return columnName; }
    public void setColumnName(String columnName) { this.columnName = columnName; }

    public String getDisplayName() { return displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }

    public String getDataType() { return dataType; }
    public void setDataType(String dataType) { this.dataType = dataType; }

    public Boolean getIsNullable() { return isNullable; }
    public void setIsNullable(Boolean isNullable) { this.isNullable = isNullable; }

    public Integer getDisplayOrder() { return displayOrder; }
    public void setDisplayOrder(Integer displayOrder) { this.displayOrder = displayOrder; }

    public Boolean getIsVisible() { return isVisible; }
    public void setIsVisible(Boolean isVisible) { this.isVisible = isVisible; }
}