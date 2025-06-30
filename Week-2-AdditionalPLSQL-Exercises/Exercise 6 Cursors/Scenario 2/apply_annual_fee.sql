-- Apply annual maintenance fee to all accounts

SET SERVEROUTPUT ON;
DECLARE
  CURSOR acc_cursor IS
    SELECT AccountID, Balance FROM Accounts;

  v_accid Accounts.AccountID%TYPE;
  v_balance Accounts.Balance%TYPE;
  v_fee CONSTANT NUMBER := 100;
BEGIN
  OPEN acc_cursor;
  LOOP
    FETCH acc_cursor INTO v_accid, v_balance;
    EXIT WHEN acc_cursor%NOTFOUND;

    UPDATE Accounts SET Balance = Balance - v_fee WHERE AccountID = v_accid;
    DBMS_OUTPUT.PUT_LINE('Annual fee deducted for AccountID: ' || v_accid);
  END LOOP;
  CLOSE acc_cursor;
  COMMIT;
END;
/
