-- Update interest rates for all loans based on policy

SET SERVEROUTPUT ON;
DECLARE
  CURSOR loan_cursor IS
    SELECT LoanID, InterestRate FROM Loans;

  v_loanid Loans.LoanID%TYPE;
  v_rate Loans.InterestRate%TYPE;
BEGIN
  OPEN loan_cursor;
  LOOP
    FETCH loan_cursor INTO v_loanid, v_rate;
    EXIT WHEN loan_cursor%NOTFOUND;

    -- For example: Increase rate by 0.5%
    UPDATE Loans SET InterestRate = v_rate + 0.5 WHERE LoanID = v_loanid;
    DBMS_OUTPUT.PUT_LINE('Updated Interest Rate for LoanID: ' || v_loanid);
  END LOOP;
  CLOSE loan_cursor;
  COMMIT;
END;
/
