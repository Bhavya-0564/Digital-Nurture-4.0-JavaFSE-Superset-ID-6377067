 BEGIN
    FOR rec IN (
        SELECT CustomerID FROM Customers WHERE Balance > 10000
    ) LOOP
        UPDATE Customers
        SET IsVIP = 'Y'
        WHERE CustomerID = rec.CustomerID;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Scenario 2: VIP status updated.');
END;
/
