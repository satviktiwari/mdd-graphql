// JoinedRow.java
package com.example.financialservices.model.graphql;
import java.util.List;

public class JoinedRow {
    private List<Field> fields;           // coverage's own fields
    private List<RelatedEntity> related;  // stitched worker + company

    public JoinedRow(List<Field> fields, List<RelatedEntity> related) {
        this.fields  = fields;
        this.related = related;
    }
    public List<Field> getFields()              { return fields; }
    public List<RelatedEntity> getRelated()     { return related; }
}