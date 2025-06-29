CREATE OR REPLACE PROCEDURE TransferFunds(
    fromAccount IN NUMBER,
    toAccount IN NUMBER,
    amount IN NUMBER
) AS
    insufficient_balance EXCEPTION;
BEGIN
    -- Check balance
    DECLARE
        src_balance NUMBER;
    BEGIN
        SELECT Balance INTO src_balance FROM Accounts WHERE AccountID = fromAccount;
        IF src_balance < amount THEN
            RAISE insufficient_balance;
        END IF;

        -- Perform transfer
        UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = fromAccount;
        UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = toAccount;

        COMMIT;
    END;

EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
        ROLLBACK;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error occurred: ' || SQLERRM);
        ROLLBACK;
END;
/
