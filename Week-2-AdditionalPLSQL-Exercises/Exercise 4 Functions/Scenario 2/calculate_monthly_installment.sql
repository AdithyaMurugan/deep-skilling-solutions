-- Function to calculate monthly EMI

CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
  loan_amount NUMBER,
  annual_rate NUMBER,
  years NUMBER
) RETURN NUMBER IS
  monthly_rate NUMBER := annual_rate / 12 / 100;
  months NUMBER := years * 12;
  emi NUMBER;
BEGIN
  
  emi := (loan_amount * monthly_rate * POWER(1 + monthly_rate, months)) /
         (POWER(1 + monthly_rate, months) - 1);
  RETURN ROUND(emi, 2);
END;
/
