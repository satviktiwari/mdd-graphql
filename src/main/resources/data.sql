-- ============================================================
--  WORKER DATA  (25 rows)
--  Our internal employees who cover client companies
-- ============================================================
INSERT INTO worker_data (id, first_name, last_name, email, phone, department, designation, hire_date, is_active) VALUES
(1,  'Ananya',   'Sharma',    'ananya.sharma@finserv.com',    '+91-9810001001', 'Equity Research',       'Senior Analyst',        '2018-03-12', true),
(2,  'Rohan',    'Mehta',     'rohan.mehta@finserv.com',      '+91-9810001002', 'Fixed Income',          'Analyst',               '2020-07-01', true),
(3,  'Priya',    'Nair',      'priya.nair@finserv.com',       '+91-9810001003', 'Equity Research',       'Lead Analyst',          '2016-11-20', true),
(4,  'Vikram',   'Iyer',      'vikram.iyer@finserv.com',      '+91-9810001004', 'Derivatives',           'Senior Analyst',        '2019-05-15', true),
(5,  'Sneha',    'Kulkarni',  'sneha.kulkarni@finserv.com',   '+91-9810001005', 'Equity Research',       'Analyst',               '2021-02-08', true),
(6,  'Aditya',   'Joshi',     'aditya.joshi@finserv.com',     '+91-9810001006', 'Fixed Income',          'Senior Analyst',        '2017-09-30', true),
(7,  'Kavya',    'Reddy',     'kavya.reddy@finserv.com',      '+91-9810001007', 'Macro Research',        'Lead Analyst',          '2015-04-22', true),
(8,  'Arjun',    'Patel',     'arjun.patel@finserv.com',      '+91-9810001008', 'Credit Research',       'Analyst',               '2022-01-17', true),
(9,  'Meera',    'Singh',     'meera.singh@finserv.com',      '+91-9810001009', 'Equity Research',       'Principal Analyst',     '2013-06-10', true),
(10, 'Siddharth','Rao',       'siddharth.rao@finserv.com',    '+91-9810001010', 'Derivatives',           'Analyst',               '2021-08-25', true),
(11, 'Pooja',    'Verma',     'pooja.verma@finserv.com',      '+91-9810001011', 'Macro Research',        'Senior Analyst',        '2018-12-03', true),
(12, 'Nikhil',   'Gupta',     'nikhil.gupta@finserv.com',     '+91-9810001012', 'Fixed Income',          'Principal Analyst',     '2014-03-18', true),
(13, 'Ishaan',   'Bose',      'ishaan.bose@finserv.com',      '+91-9810001013', 'Credit Research',       'Senior Analyst',        '2019-10-07', true),
(14, 'Aarti',    'Pillai',    'aarti.pillai@finserv.com',     '+91-9810001014', 'Equity Research',       'Analyst',               '2023-03-01', true),
(15, 'Rahul',    'Mishra',    'rahul.mishra@finserv.com',     '+91-9810001015', 'Derivatives',           'Lead Analyst',          '2016-07-14', true),
(16, 'Divya',    'Chatterjee','divya.chatterjee@finserv.com', '+91-9810001016', 'Macro Research',        'Analyst',               '2022-06-20', true),
(17, 'Kunal',    'Saxena',    'kunal.saxena@finserv.com',     '+91-9810001017', 'Credit Research',       'Lead Analyst',          '2015-11-29', true),
(18, 'Tanvi',    'Kapoor',    'tanvi.kapoor@finserv.com',     '+91-9810001018', 'Equity Research',       'Senior Analyst',        '2020-04-13', true),
(19, 'Gaurav',   'Dubey',     'gaurav.dubey@finserv.com',     '+91-9810001019', 'Fixed Income',          'Analyst',               '2021-09-09', true),
(20, 'Ritu',     'Agarwal',   'ritu.agarwal@finserv.com',     '+91-9810001020', 'Equity Research',       'Principal Analyst',     '2012-08-05', true),
(21, 'Deepak',   'Menon',     'deepak.menon@finserv.com',     '+91-9810001021', 'Derivatives',           'Senior Analyst',        '2017-02-27', false),
(22, 'Sunita',   'Tiwari',    'sunita.tiwari@finserv.com',    '+91-9810001022', 'Credit Research',       'Analyst',               '2023-07-11', true),
(23, 'Manish',   'Srivastava','manish.srivastava@finserv.com','+91-9810001023', 'Macro Research',        'Senior Analyst',        '2018-05-16', true),
(24, 'Pallavi',  'Bhatt',     'pallavi.bhatt@finserv.com',    '+91-9810001024', 'Equity Research',       'Lead Analyst',          '2016-10-02', true),
(25, 'Karan',    'Malhotra',  'karan.malhotra@finserv.com',   '+91-9810001025', 'Fixed Income',          'Analyst',               '2022-11-30', true);


-- ============================================================
--  COMPANY DATA  (25 rows)
--  Client companies we provide financial services to
-- ============================================================
INSERT INTO company_data (id, company_name, ticker, sector, industry, headquarters, country, market_cap_crore, annual_revenue_crore, employee_count, listed_exchange, onboarded_date, status) VALUES
(1,  'Tata Consultancy Services',  'TCS',     'Technology',        'IT Services',            'Mumbai',    'India',  1420000, 225000, 614000, 'NSE/BSE', '2015-06-01', 'ACTIVE'),
(2,  'Infosys Ltd',                'INFY',    'Technology',        'IT Services',            'Bengaluru', 'India',   635000, 146000, 343000, 'NSE/BSE', '2015-06-01', 'ACTIVE'),
(3,  'HDFC Bank Ltd',              'HDFCBANK', 'Financials',       'Private Banking',        'Mumbai',    'India',  1180000, 198000, 177000, 'NSE/BSE', '2016-01-15', 'ACTIVE'),
(4,  'Reliance Industries',        'RELIANCE', 'Energy',           'Conglomerate',           'Mumbai',    'India',  1890000, 900000, 236000, 'NSE/BSE', '2016-03-10', 'ACTIVE'),
(5,  'Wipro Ltd',                  'WIPRO',   'Technology',        'IT Services',            'Bengaluru', 'India',   255000,  90000, 250000, 'NSE/BSE', '2017-02-20', 'ACTIVE'),
(6,  'ITC Ltd',                    'ITC',     'Consumer Staples',  'FMCG & Hotels',          'Kolkata',   'India',   560000,  72000,  35000, 'NSE/BSE', '2017-05-11', 'ACTIVE'),
(7,  'Larsen & Toubro',            'LT',      'Industrials',       'Engineering & Const.',   'Mumbai',    'India',   490000, 212000, 161000, 'NSE/BSE', '2017-08-01', 'ACTIVE'),
(8,  'Bajaj Finance Ltd',          'BAJFINANCE','Financials',      'NBFC',                   'Pune',      'India',   430000,  55000,  42000, 'NSE/BSE', '2018-01-09', 'ACTIVE'),
(9,  'Hindustan Unilever',         'HINDUNILVR','Consumer Staples', 'FMCG',                  'Mumbai',    'India',   575000,  62000,  21000, 'NSE/BSE', '2018-04-22', 'ACTIVE'),
(10, 'Maruti Suzuki India',        'MARUTI',  'Consumer Discretionary','Automobiles',        'New Delhi', 'India',   390000, 130000,  23000, 'NSE/BSE', '2018-07-30', 'ACTIVE'),
(11, 'Asian Paints Ltd',           'ASIANPAINT','Materials',       'Specialty Chemicals',    'Mumbai',    'India',   310000,  36000,  20000, 'NSE/BSE', '2019-01-14', 'ACTIVE'),
(12, 'Axis Bank Ltd',              'AXISBANK', 'Financials',       'Private Banking',        'Mumbai',    'India',   380000, 115000,  75000, 'NSE/BSE', '2019-03-05', 'ACTIVE'),
(13, 'Sun Pharmaceutical',         'SUNPHARMA','Healthcare',       'Pharmaceuticals',        'Mumbai',    'India',   330000,  47000,  33000, 'NSE/BSE', '2019-06-18', 'ACTIVE'),
(14, 'Titan Company Ltd',          'TITAN',   'Consumer Discretionary','Jewellery & Watches','Bengaluru','India',    295000,  45000,  11000, 'NSE/BSE', '2019-09-02', 'ACTIVE'),
(15, 'UltraTech Cement',           'ULTRACEMCO','Materials',       'Cement',                 'Mumbai',    'India',   280000,  64000,  21000, 'NSE/BSE', '2020-01-20', 'ACTIVE'),
(16, 'Kotak Mahindra Bank',        'KOTAKBANK','Financials',       'Private Banking',        'Mumbai',    'India',   360000,  74000,  78000, 'NSE/BSE', '2020-04-08', 'ACTIVE'),
(17, 'Nestle India Ltd',           'NESTLEIND','Consumer Staples', 'Packaged Foods',         'Gurgaon',   'India',   215000,  20000,   8000, 'NSE/BSE', '2020-07-15', 'ACTIVE'),
(18, 'Power Grid Corporation',     'POWERGRID','Utilities',        'Electric Utilities',     'Gurgaon',   'India',   265000,  46000,  11000, 'NSE/BSE', '2020-10-01', 'ACTIVE'),
(19, 'NTPC Ltd',                   'NTPC',    'Utilities',         'Electric Generation',    'New Delhi', 'India',   295000,  170000, 20000, 'NSE/BSE', '2021-02-11', 'ACTIVE'),
(20, 'Tata Motors Ltd',            'TATAMOTORS','Consumer Discretionary','Automobiles',      'Mumbai',    'India',   380000, 440000, 102000, 'NSE/BSE', '2021-05-19', 'ACTIVE'),
(21, 'Dr Reddys Laboratories',     'DRREDDY', 'Healthcare',        'Pharmaceuticals',        'Hyderabad', 'India',   105000,  28000,  24000, 'NSE/BSE', '2021-08-30', 'ACTIVE'),
(22, 'Adani Enterprises',          'ADANIENT', 'Industrials',      'Conglomerate',           'Ahmedabad', 'India',   310000, 875000,  28000, 'NSE/BSE', '2022-01-10', 'ACTIVE'),
(23, 'SBI Life Insurance',         'SBILIFE', 'Financials',        'Life Insurance',         'Mumbai',    'India',   165000,  120000,  22000, 'NSE/BSE', '2022-06-07', 'ACTIVE'),
(24, 'Divi Laboratories',          'DIVISLAB', 'Healthcare',       'Specialty Pharma',       'Hyderabad', 'India',    95000,  10000,  18000, 'NSE/BSE', '2023-02-14', 'ACTIVE'),
(25, 'Zomato Ltd',                 'ZOMATO',  'Consumer Discretionary','Food Delivery',      'Gurgaon',   'India',   195000,  12000,   8000, 'NSE',     '2023-08-01', 'ACTIVE');


-- ============================================================
--  COVERAGE DATA  (25 rows)
--  Which worker covers which company, and coverage metadata
-- ============================================================
INSERT INTO coverage_data (id, worker_id, company_id, coverage_type, start_date, end_date, rating, target_price, notes, is_primary_coverage) VALUES
(1,  9,  1,  'EQUITY',       '2015-06-01', null,         'BUY',          4800.00, 'Strong IT services play with consistent dividend growth.',         true),
(2,  3,  2,  'EQUITY',       '2015-06-01', null,         'BUY',          1950.00, 'Solid margin expansion; digital revenues growing at 25% YoY.',   true),
(3,  1,  5,  'EQUITY',       '2017-02-20', null,         'HOLD',         560.00,  'Restructuring benefits may take 2 quarters to reflect.',          true),
(4,  18, 1,  'EQUITY',       '2020-04-13', null,         'BUY',          4900.00, 'Secondary coverage; tracking cloud deal pipeline closely.',        false),
(5,  7,  7,  'MACRO',        '2017-08-01', null,         'BUY',          3800.00, 'Infra order book at all-time high; defence orders accelerating.',  true),
(6,  12, 3,  'FIXED_INCOME', '2016-01-15', null,         'OVERWEIGHT',   null,    'HDFCBANK bonds rated AAA; low credit risk, good yield spread.',    true),
(7,  6,  6,  'FIXED_INCOME', '2017-05-11', null,         'OVERWEIGHT',   null,    'ITC debentures offer stable returns; tobacco cash flows robust.',  true),
(8,  4,  4,  'DERIVATIVES',  '2016-03-10', null,         'NEUTRAL',      null,    'Covered call strategy for Reliance; implied volatility elevated.', true),
(9,  15, 10, 'DERIVATIVES',  '2018-07-30', null,         'BULLISH',      null,    'Long calls ahead of new model launches; strong retail demand.',    true),
(10, 20, 9,  'EQUITY',       '2018-04-22', null,         'HOLD',         2600.00, 'Premium valuation; rural recovery needed to re-rate.',             true),
(11, 24, 14, 'EQUITY',       '2016-10-02', null,         'BUY',          4200.00, 'Jewellery segment market share gains; watches recovering.',        true),
(12, 9,  20, 'EQUITY',       '2021-05-19', null,         'BUY',          1100.00, 'JLR turnaround story intact; EV transition well funded.',          true),
(13, 17, 13, 'CREDIT',       '2019-06-18', null,         'OVERWEIGHT',   null,    'Strong balance sheet; US generics pipeline reducing credit risk.',  true),
(14, 13, 12, 'CREDIT',       '2019-03-05', null,         'NEUTRAL',      null,    'Axis Bank bonds fairly priced; watch for NPA trajectory.',         true),
(15, 11, 8,  'MACRO',        '2018-01-09', null,         'BUY',          7800.00, 'NBFC with best-in-class asset quality; consumer credit boom.',     true),
(16, 23, 19, 'MACRO',        '2021-02-11', null,         'HOLD',         230.00,  'Capacity addition on track; tariff revision key trigger.',         true),
(17, 2,  16, 'FIXED_INCOME', '2020-04-08', null,         'OVERWEIGHT',   null,    'Kotak bonds AAA; strong liability franchise, low slippages.',      true),
(18, 8,  22, 'CREDIT',       '2022-01-10', null,         'NEUTRAL',      null,    'Adani group leverage elevated; monitoring refinancing schedule.',   true),
(19, 16, 25, 'EQUITY',       '2023-08-01', null,         'HOLD',         185.00,  'Path to profitability clearer; unit economics improving.',         true),
(20, 5,  11, 'EQUITY',       '2019-01-14', null,         'BUY',          3500.00, 'Asian Paints volume recovery post monsoon; strong pricing power.',  true),
(21, 10, 4,  'DERIVATIVES',  '2016-03-10', null,         'BULLISH',      null,    'Options on RIL pre-AGM; Jio and retail catalysts expected.',       false),
(22, 19, 15, 'FIXED_INCOME', '2020-01-20', null,         'OVERWEIGHT',   null,    'UltraTech NCD at attractive spread; infra capex to drive volume.', true),
(23, 22, 23, 'EQUITY',       '2022-06-07', null,         'BUY',          1650.00, 'SBI Life VNB growth strong; embedded value re-rating likely.',     true),
(24, 25, 18, 'FIXED_INCOME', '2020-10-01', null,         'OVERWEIGHT',   null,    'PowerGrid bonds sovereign-like; regulated returns predictable.',    true),
(25, 14, 21, 'EQUITY',       '2021-08-30', '2024-01-31', 'SELL',         4500.00, 'Coverage closed after client offboarding. Final rating: SELL.',   true);

-- ── API METADATA ─────────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS api_metadata (
                                            id            BIGINT PRIMARY KEY AUTO_INCREMENT,
                                            api_name      VARCHAR(50)  NOT NULL UNIQUE,  -- matches /api/<api_name>
    source_table  VARCHAR(100) NOT NULL,          -- actual DB table
    sql_query     TEXT         NOT NULL,          -- SQL to execute
    description   VARCHAR(255),
    is_active     BOOLEAN DEFAULT TRUE,
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

-- ── COLUMN MAPPING ───────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS column_mapping (
                                              id              BIGINT PRIMARY KEY AUTO_INCREMENT,
                                              api_id          BIGINT       NOT NULL REFERENCES api_metadata(id),
    column_name     VARCHAR(100) NOT NULL,   -- actual DB column name
    display_name    VARCHAR(100) NOT NULL,   -- key in JSON response
    data_type       VARCHAR(30)  NOT NULL,   -- STRING, NUMBER, BOOLEAN, DATE
    is_nullable     BOOLEAN DEFAULT TRUE,
    display_order   INT     DEFAULT 0,       -- order in response
    is_visible      BOOLEAN DEFAULT TRUE     -- false = exclude from response
    );

-- ── SEED: api_metadata ───────────────────────────────────────────
INSERT INTO api_metadata (id, api_name, source_table, sql_query, description) VALUES
                                                                                  (1, 'worker',
                                                                                   'worker_data',
                                                                                   'SELECT id, first_name, last_name, email, phone, department, designation, hire_date, is_active FROM worker_data',
                                                                                   'Returns all internal workers/analysts'),

                                                                                  (2, 'company',
                                                                                   'company_data',
                                                                                   'SELECT id, company_name, ticker, sector, industry, headquarters, country, market_cap_crore, annual_revenue_crore, employee_count, listed_exchange, onboarded_date, status FROM company_data',
                                                                                   'Returns all client companies'),

                                                                                  (3, 'coverage',
                                                                                   'coverage_data',
                                                                                   'SELECT id, worker_id, company_id, coverage_type, start_date, end_date, rating, target_price, notes, is_primary_coverage FROM coverage_data',
                                                                                   'Returns all coverage records');

-- ── SEED: column_mapping for worker (api_id = 1) ─────────────────
INSERT INTO column_mapping (api_id, column_name, display_name, data_type, is_nullable, display_order) VALUES
                                                                                                          (1, 'id',          'id',          'NUMBER',  false, 1),
                                                                                                          (1, 'first_name',  'firstName',   'STRING',  false, 2),
                                                                                                          (1, 'last_name',   'lastName',    'STRING',  false, 3),
                                                                                                          (1, 'email',       'email',       'STRING',  false, 4),
                                                                                                          (1, 'phone',       'phone',       'STRING',  true,  5),
                                                                                                          (1, 'department',  'department',  'STRING',  false, 6),
                                                                                                          (1, 'designation', 'designation', 'STRING',  false, 7),
                                                                                                          (1, 'hire_date',   'hireDate',    'DATE',    true,  8),
                                                                                                          (1, 'is_active',   'isActive',    'BOOLEAN', true,  9);

-- ── SEED: column_mapping for company (api_id = 2) ────────────────
INSERT INTO column_mapping (api_id, column_name, display_name, data_type, is_nullable, display_order) VALUES
                                                                                                          (2, 'id',                   'id',                 'NUMBER',  false, 1),
                                                                                                          (2, 'company_name',         'companyName',        'STRING',  false, 2),
                                                                                                          (2, 'ticker',               'ticker',             'STRING',  false, 3),
                                                                                                          (2, 'sector',               'sector',             'STRING',  false, 4),
                                                                                                          (2, 'industry',             'industry',           'STRING',  false, 5),
                                                                                                          (2, 'headquarters',         'headquarters',       'STRING',  true,  6),
                                                                                                          (2, 'country',              'country',            'STRING',  true,  7),
                                                                                                          (2, 'market_cap_crore',     'marketCapCrore',     'NUMBER',  true,  8),
                                                                                                          (2, 'annual_revenue_crore', 'annualRevenueCrore', 'NUMBER',  true,  9),
                                                                                                          (2, 'employee_count',       'employeeCount',      'NUMBER',  true,  10),
                                                                                                          (2, 'listed_exchange',      'listedExchange',     'STRING',  true,  11),
                                                                                                          (2, 'onboarded_date',       'onboardedDate',      'DATE',    true,  12),
                                                                                                          (2, 'status',               'status',             'STRING',  true,  13);

-- ── SEED: column_mapping for coverage (api_id = 3) ───────────────
INSERT INTO column_mapping (api_id, column_name, display_name, data_type, is_nullable, display_order) VALUES
                                                                                                          (3, 'id',                 'id',               'NUMBER',  false, 1),
                                                                                                          (3, 'worker_id',          'workerId',         'NUMBER',  false, 2),
                                                                                                          (3, 'company_id',         'companyId',        'NUMBER',  false, 3),
                                                                                                          (3, 'coverage_type',      'coverageType',     'STRING',  false, 4),
                                                                                                          (3, 'start_date',         'startDate',        'DATE',    false, 5),
                                                                                                          (3, 'end_date',           'endDate',          'DATE',    true,  6),
                                                                                                          (3, 'rating',             'rating',           'STRING',  true,  7),
                                                                                                          (3, 'target_price',       'targetPrice',      'NUMBER',  true,  8),
                                                                                                          (3, 'notes',              'notes',            'STRING',  true,  9),
                                                                                                          (3, 'is_primary_coverage','isPrimaryCoverage','BOOLEAN', true,  10);