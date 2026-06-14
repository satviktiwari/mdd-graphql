package com.example.financialservices.controller;

import com.example.financialservices.model.CompanyData;
import com.example.financialservices.repository.CompanyDataRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyDataRepository repo;

    public CompanyController(CompanyDataRepository repo) {
        this.repo = repo;
    }

    /** GET /api/company  — returns all companies */
    @GetMapping
    public List<CompanyData> getAllCompanies() {
        return repo.findAll();
    }

    /** GET /api/company/{id}  — single company by PK */
    @GetMapping("/{id}")
    public ResponseEntity<CompanyData> getCompanyById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /** GET /api/company?ticker=TCS */
    @GetMapping(params = "ticker")
    public ResponseEntity<CompanyData> getByTicker(@RequestParam String ticker) {
        return repo.findByTickerIgnoreCase(ticker)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /** GET /api/company?sector=Technology */
    @GetMapping(params = "sector")
    public List<CompanyData> getBySector(@RequestParam String sector) {
        return repo.findBySectorIgnoreCase(sector);
    }

    /** GET /api/company?status=ACTIVE */
    @GetMapping(params = "status")
    public List<CompanyData> getByStatus(@RequestParam String status) {
        return repo.findByStatus(status.toUpperCase());
    }
}
