-- Enable DBMS output
SET SERVEROUTPUT ON;

-- Create tables
@01_create_tables.sql

-- Insert test data
@05_insert_sample_data.sql

-- Create procedures
@02_process_monthly_interest.sql
@03_update_employee_bonus.sql
@04_transfer_funds.sql

-- Run procedure tests
@06_test_procedures.sql
