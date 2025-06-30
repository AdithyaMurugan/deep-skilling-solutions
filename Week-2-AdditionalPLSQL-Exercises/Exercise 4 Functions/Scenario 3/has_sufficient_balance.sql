-- Function to check if account has sufficient balance

CREATE OR REPLACE FUNCTION HasSufficientBalance (
  acc_id NUMBER,
  amount NUMBER
) RETURN BOOLEAN IS
  bal NUMBER;
BEGIN
  SELECT Balance INTO bal FROM Accounts WHERE AccountID = acc_id;
  RETURN bal >= amount;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    RETURN FALSE;
END;
/