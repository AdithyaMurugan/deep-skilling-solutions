-- Trigger to enforce deposit/withdrawal rules

CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
  acc_balance NUMBER;
BEGIN
  -- Get current account balance
  SELECT Balance INTO acc_balance FROM Accounts WHERE AccountID = :NEW.AccountID;

  IF :NEW.TransactionType = 'Withdrawal' AND :NEW.Amount > acc_balance THEN
    RAISE_APPLICATION_ERROR(-20001, 'Withdrawal amount exceeds account balance');
  ELSIF :NEW.TransactionType = 'Deposit' AND :NEW.Amount <= 0 THEN
    RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be positive');
  END IF;
END;
/
