package com.example.financialservices.model.graphql;

import java.util.List;

public class DynamicRow {
    private List<Field> fields;

    public DynamicRow(List<Field> fields) {
        this.fields = fields;
    }

    public List<Field> getFields() { return fields; }
}