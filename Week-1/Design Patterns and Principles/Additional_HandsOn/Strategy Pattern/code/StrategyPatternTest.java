package StrategyPattern;

public class StrategyPatternTest {
	 public static void main(String[] args) {
	        PaymentContext context = new PaymentContext();

	      
	        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012", "Adithya"));
	        context.executePayment(1500.00);

	        System.out.println();

	        context.setPaymentStrategy(new PayPalPayment("adithya@mail.com"));
	        context.executePayment(950.50);
	    }
}
