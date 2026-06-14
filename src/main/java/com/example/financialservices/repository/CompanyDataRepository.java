package com.example.financialservices.repository;

import com.example.financialservices.model.CompanyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyDataRepository extends JpaRepository<CompanyData, Long> {

    Optional<CompanyData> findByTickerIgnoreCase(String ticker);

    List<CompanyData> findBySectorIgnoreCase(String sector);

    List<CompanyData> findByStatus(String status);
}
