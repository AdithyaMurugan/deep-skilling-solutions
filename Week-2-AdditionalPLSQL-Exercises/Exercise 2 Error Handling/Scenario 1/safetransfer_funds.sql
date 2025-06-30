-- Procedure to safely transfer funds with error handling

CREATE OR REPLACE PROCEDURE SafeTransferFunds (
  from_account IN NUMBER,
  to_account IN NUMBER,
  amount IN NUMBER
) IS
  from_balance NUMBER;
BEGIN
  
  SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = from_account;

  
  IF from_balance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds for transfer');
  END IF;

  
  UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = from_account;
  UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = to_account;

  COMMIT;

EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/
