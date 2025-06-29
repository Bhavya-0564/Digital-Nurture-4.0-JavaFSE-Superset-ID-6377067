-- Optional: Enable DBMS Output
SET SERVEROUTPUT ON;

-- Run all scenarios
@create_tables.sql
@scenario1_discount_loans.sql
@scenario2_vip_customers.sql
@scenario3_loan_reminders.sql
