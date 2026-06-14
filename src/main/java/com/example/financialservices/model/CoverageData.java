package com.example.financialservices.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "coverage_data")
public class CoverageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "worker_id", nullable = false)
    private WorkerData worker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyData company;

    @Column(name = "coverage_type", nullable = false, length = 20)
    private String coverageType;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(length = 20)
    private String rating;

    @Column(name = "target_price", precision = 12, scale = 2)
    private BigDecimal targetPrice;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(name = "is_primary_coverage")
    private Boolean isPrimaryCoverage = true;

    public CoverageData() {}

    public CoverageData(Long id, WorkerData worker, CompanyData company,
                        String coverageType, LocalDate startDate, LocalDate endDate,
                        String rating, BigDecimal targetPrice, String notes,
                        Boolean isPrimaryCoverage) {
        this.id = id;
        this.worker = worker;
        this.company = company;
        this.coverageType = coverageType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rating = rating;
        this.targetPrice = targetPrice;
        this.notes = notes;
        this.isPrimaryCoverage = isPrimaryCoverage;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public WorkerData getWorker() { return worker; }
    public void setWorker(WorkerData worker) { this.worker = worker; }

    public CompanyData getCompany() { return company; }
    public void setCompany(CompanyData company) { this.company = company; }

    public String getCoverageType() { return coverageType; }
    public void setCoverageType(String coverageType) { this.coverageType = coverageType; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getRating() { return rating; }
    public void setRating(String rating) { this.rating = rating; }

    public BigDecimal getTargetPrice() { return targetPrice; }
    public void setTargetPrice(BigDecimal targetPrice) { this.targetPrice = targetPrice; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public Boolean getIsPrimaryCoverage() { return isPrimaryCoverage; }
    public void setIsPrimaryCoverage(Boolean isPrimaryCoverage) { this.isPrimaryCoverage = isPrimaryCoverage; }
}