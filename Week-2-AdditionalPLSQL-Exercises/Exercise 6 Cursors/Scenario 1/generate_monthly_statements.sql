-- Generate monthly statements for customers using explicit cursor

SET SERVEROUTPUT ON;
DECLARE
  CURSOR txn_cursor IS
    SELECT c.Name, t.AccountID, t.TransactionDate, t.Amount, t.TransactionType
    FROM Customers c
    JOIN Accounts a ON c.CustomerID = a.CustomerID
    JOIN Transactions t ON a.AccountID = t.AccountID
    WHERE TO_CHAR(t.TransactionDate, 'MMYYYY') = TO_CHAR(SYSDATE, 'MMYYYY');

  v_name Customers.Name%TYPE;
  v_accid Transactions.AccountID%TYPE;
  v_date Transactions.TransactionDate%TYPE;
  v_amt Transactions.Amount%TYPE;
  v_type Transactions.TransactionType%TYPE;
BEGIN
  OPEN txn_cursor;
  LOOP
    FETCH txn_cursor INTO v_name, v_accid, v_date, v_amt, v_type;
    EXIT WHEN txn_cursor%NOTFOUND;

    DBMS_OUTPUT.PUT_LINE('Customer: ' || v_name || ', Account: ' || v_accid ||
                         ', Date: ' || v_date || ', Amount: ' || v_amt || ', Type: ' || v_type);
  END LOOP;
  CLOSE txn_cursor;
END;
/
