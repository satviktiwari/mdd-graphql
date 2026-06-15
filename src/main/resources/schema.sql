-- schema.sql
CREATE TABLE IF NOT EXISTS worker_data (
                                           id            BIGINT PRIMARY KEY AUTO_INCREMENT,
                                           first_name    VARCHAR(50)  NOT NULL,
    last_name     VARCHAR(50)  NOT NULL,
    email         VARCHAR(100) NOT NULL UNIQUE,
    phone         VARCHAR(20),
    department    VARCHAR(60)  NOT NULL,
    designation   VARCHAR(60)  NOT NULL,
    hire_date     DATE,
    is_active     BOOLEAN DEFAULT TRUE
    );

CREATE TABLE IF NOT EXISTS company_data (
                                            id                    BIGINT PRIMARY KEY AUTO_INCREMENT,
                                            company_name          VARCHAR(100) NOT NULL,
    ticker                VARCHAR(20)  NOT NULL UNIQUE,
    sector                VARCHAR(60)  NOT NULL,
    industry              VARCHAR(80)  NOT NULL,
    headquarters          VARCHAR(60),
    country               VARCHAR(60),
    market_cap_crore      DECIMAL(18,2),
    annual_revenue_crore  DECIMAL(18,2),
    employee_count        INT,
    listed_exchange       VARCHAR(20),
    onboarded_date        DATE,
    status                VARCHAR(20)
    );

CREATE TABLE IF NOT EXISTS coverage_data (
                                             id                  BIGINT PRIMARY KEY AUTO_INCREMENT,
                                             worker_id           BIGINT       NOT NULL,
                                             company_id          BIGINT       NOT NULL,
                                             coverage_type       VARCHAR(20)  NOT NULL,
    start_date          DATE         NOT NULL,
    end_date            DATE,
    rating              VARCHAR(20),
    target_price        DECIMAL(12,2),
    notes               TEXT,
    is_primary_coverage BOOLEAN DEFAULT TRUE
    );


