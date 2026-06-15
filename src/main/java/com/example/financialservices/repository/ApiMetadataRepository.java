package com.example.financialservices.repository;

import com.example.financialservices.model.ApiMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// ApiMetadataRepository.java
@Repository
public interface ApiMetadataRepository extends JpaRepository<ApiMetadata, Long> {

    // Used by DynamicApiService — primary lookup by URL path name
    Optional<ApiMetadata> findByApiNameAndIsActive(String apiName, Boolean isActive);

    // Useful for admin checks — does this api_name already exist?
    boolean existsByApiName(String apiName);

    // Fetch all active APIs — useful for listing available endpoints
    List<ApiMetadata> findByIsActive(Boolean isActive);

    // Lookup by source table — e.g. find all APIs hitting worker_data
    List<ApiMetadata> findBySourceTable(String sourceTable);
}
