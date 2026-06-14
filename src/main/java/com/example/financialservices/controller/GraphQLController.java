package com.example.financialservices.controller;

import com.example.financialservices.model.*;
import com.example.financialservices.repository.*;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class GraphQLController {

    private final WorkerDataRepository workerRepo;
    private final CompanyDataRepository companyRepo;
    private final CoverageDataRepository coverageRepo;

    public GraphQLController(WorkerDataRepository workerRepo,
                             CompanyDataRepository companyRepo,
                             CoverageDataRepository coverageRepo) {
        this.workerRepo = workerRepo;
        this.companyRepo = companyRepo;
        this.coverageRepo = coverageRepo;
    }

    // ── Query resolvers (entry points) ──────────────────────────────

    @QueryMapping
    public List<WorkerData> allWorkers() {
        return workerRepo.findAll();
    }

    @QueryMapping
    public WorkerData workerById(@Argument Long id) {
        return workerRepo.findById(id).orElse(null);
    }

    @QueryMapping
    public List<CompanyData> allCompanies() {
        return companyRepo.findAll();
    }

    @QueryMapping
    public CompanyData companyById(@Argument Long id) {
        return companyRepo.findById(id).orElse(null);
    }

    @QueryMapping
    public CompanyData companyByTicker(@Argument String ticker) {
        return companyRepo.findByTickerIgnoreCase(ticker).orElse(null);
    }

    @QueryMapping
    public List<CoverageData> allCoverages() {
        return coverageRepo.findAll();
    }

    @QueryMapping
    public List<CoverageData> coveragesByWorker(@Argument Long workerId) {
        return coverageRepo.findByWorkerId(workerId);
    }

    @QueryMapping
    public List<CoverageData> coveragesByCompany(@Argument Long companyId) {
        return coverageRepo.findByCompanyId(companyId);
    }

    @QueryMapping
    public List<CoverageData> activeCoverages() {
        return coverageRepo.findAllActiveCoverage();
    }

    // ── Schema resolvers (nested traversal) ─────────────────────────
    // These tell GraphQL: "when someone asks for coverages inside a
    // Worker, here's how to fetch them"

    @SchemaMapping(typeName = "Worker")
    public List<CoverageData> coverages(WorkerData worker) {
        return coverageRepo.findByWorkerId(worker.getId());
    }

    @SchemaMapping(typeName = "Company")
    public List<CoverageData> coverages(CompanyData company) {
        return coverageRepo.findByCompanyId(company.getId());
    }

    @SchemaMapping(typeName = "Coverage")
    public WorkerData worker(CoverageData coverage) {
        return coverage.getWorker();
    }

    @SchemaMapping(typeName = "Coverage")
    public CompanyData company(CoverageData coverage) {
        return coverage.getCompany();
    }
}