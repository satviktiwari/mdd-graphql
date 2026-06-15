package com.example.financialservices.model;

import jakarta.persistence.*;

// ApiJoinConfig.java
@Entity
@Table(name = "api_join_config")
public class ApiJoinConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "parent_api_id", nullable = false)
    private Long parentApiId;

    @Column(name = "related_api_id", nullable = false)
    private Long relatedApiId;

    @Column(name = "foreign_key_col", nullable = false)
    private String foreignKeyCol;   // "worker_id" in coverage

    @Column(name = "related_key_col", nullable = false)
    private String relatedKeyCol;   // "id" in worker

    public Long getId()                  { return id; }
    public void setId(Long id)           { this.id = id; }
    public Long getParentApiId()         { return parentApiId; }
    public void setParentApiId(Long v)   { this.parentApiId = v; }
    public Long getRelatedApiId()        { return relatedApiId; }
    public void setRelatedApiId(Long v)  { this.relatedApiId = v; }
    public String getForeignKeyCol()     { return foreignKeyCol; }
    public void setForeignKeyCol(String v){ this.foreignKeyCol = v; }
    public String getRelatedKeyCol()     { return relatedKeyCol; }
    public void setRelatedKeyCol(String v){ this.relatedKeyCol = v; }
}
