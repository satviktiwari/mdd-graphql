package com.example.financialservices.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "company_data")
public class CompanyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name", nullable = false, length = 100)
    private String companyName;

    @Column(nullable = false, unique = true, length = 20)
    private String ticker;

    @Column(nullable = false, length = 60)
    private String sector;

    @Column(nullable = false, length = 80)
    private String industry;

    @Column(length = 60)
    private String headquarters;

    @Column(length = 60)
    private String country;

    @Column(name = "market_cap_crore", precision = 18, scale = 2)
    private BigDecimal marketCapCrore;

    @Column(name = "annual_revenue_crore", precision = 18, scale = 2)
    private BigDecimal annualRevenueCrore;

    @Column(name = "employee_count")
    private Integer employeeCount;

    @Column(name = "listed_exchange", length = 20)
    private String listedExchange;

    @Column(name = "onboarded_date")
    private LocalDate onboardedDate;

    @Column(length = 20)
    private String status;

    public CompanyData() {}

    public CompanyData(Long id, String companyName, String ticker, String sector,
                       String industry, String headquarters, String country,
                       BigDecimal marketCapCrore, BigDecimal annualRevenueCrore,
                       Integer employeeCount, String listedExchange,
                       LocalDate onboardedDate, String status) {
        this.id = id;
        this.companyName = companyName;
        this.ticker = ticker;
        this.sector = sector;
        this.industry = industry;
        this.headquarters = headquarters;
        this.country = country;
        this.marketCapCrore = marketCapCrore;
        this.annualRevenueCrore = annualRevenueCrore;
        this.employeeCount = employeeCount;
        this.listedExchange = listedExchange;
        this.onboardedDate = onboardedDate;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getTicker() { return ticker; }
    public void setTicker(String ticker) { this.ticker = ticker; }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }

    public String getIndustry() { return industry; }
    public void setIndustry(String industry) { this.industry = industry; }

    public String getHeadquarters() { return headquarters; }
    public void setHeadquarters(String headquarters) { this.headquarters = headquarters; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public BigDecimal getMarketCapCrore() { return marketCapCrore; }
    public void setMarketCapCrore(BigDecimal marketCapCrore) { this.marketCapCrore = marketCapCrore; }

    public BigDecimal getAnnualRevenueCrore() { return annualRevenueCrore; }
    public void setAnnualRevenueCrore(BigDecimal annualRevenueCrore) { this.annualRevenueCrore = annualRevenueCrore; }

    public Integer getEmployeeCount() { return employeeCount; }
    public void setEmployeeCount(Integer employeeCount) { this.employeeCount = employeeCount; }

    public String getListedExchange() { return listedExchange; }
    public void setListedExchange(String listedExchange) { this.listedExchange = listedExchange; }

    public LocalDate getOnboardedDate() { return onboardedDate; }
    public void setOnboardedDate(LocalDate onboardedDate) { this.onboardedDate = onboardedDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}