// JoinedResponse.java
package com.example.financialservices.model.graphql;
import java.util.List;

public class JoinedResponse {
    private String apiName;
    private int totalRows;
    private List<JoinedRow> rows;

    public JoinedResponse(String apiName, List<JoinedRow> rows) {
        this.apiName   = apiName;
        this.totalRows = rows.size();
        this.rows      = rows;
    }
    public String getApiName()        { return apiName; }
    public int getTotalRows()         { return totalRows; }
    public List<JoinedRow> getRows()  { return rows; }
}