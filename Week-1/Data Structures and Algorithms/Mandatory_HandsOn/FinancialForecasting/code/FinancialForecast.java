package FinancialForecasting;

/*
 Recursion :
 
* Recursion is when a method calls itself to break a problem into smaller parts.
* Useful for repetitive calculations like compound interest or predicting trends.
* Example: To calculate next year's value, use current value and growth rate recursively.

*/

public class FinancialForecast {
	    public static double predictFutureValue(double currentValue, double growthRate, int years) {
	        if (years == 0) {
	            return currentValue;
	        }
	        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
	    }

	    public static void main(String[] args) {
	        double initialAmount = 10000; 
	        double annualGrowthRate = 0.08; 
	        int numYears = 5; 

	        double futureValue = predictFutureValue(initialAmount, annualGrowthRate, numYears);
	        System.out.printf("Predicted value after %d years: ₹%.2f\n", numYears, futureValue);
	    }
	    /*
	      Time Complexity Analysis
	    
	      Recursive Forecast:
	        - Time Complexity: O(n), where n = number of years
	        - One call for each year
	     
	       Optimization Tip:
	         - Use iteration instead of recursion to avoid deep call stack.
	         - Or use memoization if previous values are reused.
	     */
	
	}


