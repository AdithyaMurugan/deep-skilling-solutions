package AdapterPattern;

public class AdapterPatternTest {
	 public static void main(String[] args) {

	        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
	        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());

	        payPalProcessor.processPayment(2500.00);
	        stripeProcessor.processPayment(4300.50);
	    }
}
