-- Enable output
SET SERVEROUTPUT ON;

-- Test interest calculation
EXEC ProcessMonthlyInterest;

-- Test employee bonus
EXEC UpdateEmployeeBonus('HR', 10);

-- Test fund transfer
EXEC TransferFunds(101, 102, 500);
