-- Scenario 2: Set IsVIP = TRUE for customers with balance > 10000


ALTER TABLE Customers ADD IsVIP VARCHAR2(5);


BEGIN
  FOR c IN (SELECT CustomerID, Balance FROM Customers)
  LOOP
    IF c.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP = 'TRUE'
      WHERE CustomerID = c.CustomerID;
    END IF;
  END LOOP;

  COMMIT;
END;