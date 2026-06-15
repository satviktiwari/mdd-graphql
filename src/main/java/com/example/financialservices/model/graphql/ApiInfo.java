// ApiInfo.java
package com.example.financialservices.model.graphql;

public class ApiInfo {
    private String apiName;
    private String description;
    private String sourceTable;
    private long columnCount;

    public ApiInfo(String apiName, String description, String sourceTable, long columnCount) {
        this.apiName      = apiName;
        this.description  = description;
        this.sourceTable  = sourceTable;
        this.columnCount  = columnCount;
    }

    public String getApiName()     { return apiName; }
    public String getDescription() { return description; }
    public String getSourceTable() { return sourceTable; }
    public long getColumnCount()   { return columnCount; }
}