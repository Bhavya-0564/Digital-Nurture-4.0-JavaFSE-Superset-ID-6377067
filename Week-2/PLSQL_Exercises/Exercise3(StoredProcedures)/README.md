# PL/SQL Stored Procedures

## Overview
This project simulates a banking system using PL/SQL stored procedures for common operations like interest processing, employee bonuses, and fund transfers.

## Files
| File | Description |
|------|-------------|
| 01_create_tables.sql | Creates `Accounts` and `Employees` tables |
| 02_process_monthly_interest.sql | Applies 1% monthly interest to savings accounts |
| 03_update_employee_bonus.sql | Updates salary of employees in a department with a bonus |
| 04_transfer_funds.sql | Transfers funds between accounts with balance check |
| 05_insert_sample_data.sql | Adds test data for accounts and employees |
| 06_test_procedures.sql | Executes the stored procedures for testing |

## How to Run

### Step 1: Connect to Oracle via SQLcl
```bash
sql -oci=false your_username/your_password@localhost:1521/XEPDB1
