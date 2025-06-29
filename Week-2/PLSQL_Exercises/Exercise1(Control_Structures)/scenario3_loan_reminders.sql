BEGIN
    FOR rec IN (
        SELECT l.LoanID, c.Name, l.DueDate 
        FROM Loans l 
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan #' || rec.LoanID || ' for ' || rec.Name || 
                             ' is due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
