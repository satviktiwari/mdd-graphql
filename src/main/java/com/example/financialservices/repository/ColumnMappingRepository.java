package com.example.financialservices.repository;

import com.example.financialservices.model.ColumnMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// ColumnMappingRepository.java
@Repository
public interface ColumnMappingRepository extends JpaRepository<ColumnMapping, Long> {

    // Used by DynamicApiService — fetch visible columns in order for a given API
    List<ColumnMapping> findByApiIdAndIsVisibleOrderByDisplayOrder(Long apiId, Boolean isVisible);

    // Fetch ALL columns for an API (including hidden) — useful for admin view
    List<ColumnMapping> findByApiIdOrderByDisplayOrder(Long apiId);

    // Check if a column already mapped for this API — prevents duplicates
    boolean existsByApiIdAndColumnName(Long apiId, String columnName);

    // Delete all column mappings for an API — useful when redefining an API
    void deleteByApiId(Long apiId);

    // Count how many columns an API has
    long countByApiId(Long apiId);
}
