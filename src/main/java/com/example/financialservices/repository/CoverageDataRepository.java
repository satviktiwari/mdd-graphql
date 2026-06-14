package com.example.financialservices.repository;

import com.example.financialservices.model.CoverageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoverageDataRepository extends JpaRepository<CoverageData, Long> {

    List<CoverageData> findByWorkerId(Long workerId);

    List<CoverageData> findByCompanyId(Long companyId);

    List<CoverageData> findByCoverageTypeIgnoreCase(String coverageType);

    /** Active coverage = no end date set */
    @Query("SELECT c FROM CoverageData c WHERE c.endDate IS NULL")
    List<CoverageData> findAllActiveCoverage();
}
