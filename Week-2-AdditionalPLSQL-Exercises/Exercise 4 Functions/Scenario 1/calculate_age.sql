-- Function to calculate age in years from DOB

CREATE OR REPLACE FUNCTION CalculateAge (
  dob DATE
) RETURN NUMBER IS
  age NUMBER;
BEGIN
  age := FLOOR(MONTHS_BETWEEN(SYSDATE, dob) / 12);
  RETURN age;
END;
/