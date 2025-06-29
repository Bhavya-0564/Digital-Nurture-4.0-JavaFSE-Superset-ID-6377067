BEGIN
    FOR rec IN (
        SELECT l.LoanID, l.InterestRate 
        FROM Loans l 
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE c.Age > 60
    ) LOOP
        UPDATE Loans
        SET InterestRate = rec.InterestRate - 1
        WHERE LoanID = rec.LoanID;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Scenario 1: Discount applied to senior customers.');
END;
/
