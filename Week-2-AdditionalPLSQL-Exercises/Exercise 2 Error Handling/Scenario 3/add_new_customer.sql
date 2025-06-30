-- Procedure to add new customer with duplicate check

CREATE OR REPLACE PROCEDURE AddNewCustomer (
  cust_id IN NUMBER,
  name IN VARCHAR2,
  dob IN DATE,
  balance IN NUMBER
) IS
BEGIN
  INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
  VALUES (cust_id, name, dob, balance, SYSDATE);

  COMMIT;

EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('Customer with ID ' || cust_id || ' already exists.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error adding customer: ' || SQLERRM);
END;
/