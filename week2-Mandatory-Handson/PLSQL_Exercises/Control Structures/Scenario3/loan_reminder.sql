-- Scenario 3: Display reminder for loans due in next 30 days

BEGIN
  FOR l IN (
    SELECT l.LoanID, c.Name, l.EndDate
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.EndDate <= SYSDATE + 30
  )
  LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || l.LoanID || ' for ' || l.Name || ' is due on ' || TO_CHAR(l.EndDate, 'YYYY-MM-DD'));
  END LOOP;
END;