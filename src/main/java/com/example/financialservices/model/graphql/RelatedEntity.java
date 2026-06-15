// RelatedEntity.java
package com.example.financialservices.model.graphql;
import java.util.List;

public class RelatedEntity {
    private String entity;           // "worker" or "company"
    private List<Field> fields;

    public RelatedEntity(String entity, List<Field> fields) {
        this.entity = entity;
        this.fields = fields;
    }
    public String getEntity()        { return entity; }
    public List<Field> getFields()   { return fields; }
}