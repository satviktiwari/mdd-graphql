package com.example.financialservices.controller;

import com.example.financialservices.model.CoverageData;
import com.example.financialservices.repository.CoverageDataRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coverage")
public class CoverageController {

    private final CoverageDataRepository repo;

    public CoverageController(CoverageDataRepository repo) {
        this.repo = repo;
    }

    /** GET /api/coverage  — all coverage records */
    @GetMapping
    public List<CoverageData> getAllCoverage() {
        return repo.findAll();
    }

    /** GET /api/coverage/{id}  — single coverage record */
    @GetMapping("/{id}")
    public ResponseEntity<CoverageData> getCoverageById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /** GET /api/coverage?workerId=1  — all coverage by a specific worker */
    @GetMapping(params = "workerId")
    public List<CoverageData> getByWorker(@RequestParam Long workerId) {
        return repo.findByWorkerId(workerId);
    }

    /** GET /api/coverage?companyId=3  — all coverage for a specific company */
    @GetMapping(params = "companyId")
    public List<CoverageData> getByCompany(@RequestParam Long companyId) {
        return repo.findByCompanyId(companyId);
    }

    /** GET /api/coverage?type=EQUITY  — filter by coverage type */
    @GetMapping(params = "type")
    public List<CoverageData> getByType(@RequestParam String type) {
        return repo.findByCoverageTypeIgnoreCase(type);
    }

    /** GET /api/coverage/active  — only currently active coverage (no end date) */
    @GetMapping("/active")
    public List<CoverageData> getActiveCoverage() {
        return repo.findAllActiveCoverage();
    }
}
