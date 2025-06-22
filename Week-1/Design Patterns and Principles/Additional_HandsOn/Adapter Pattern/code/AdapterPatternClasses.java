package AdapterPattern;

interface PaymentProcessor {
    void processPayment(double amount);
}


class PayPalGateway {
    public void makePayPalPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}


class StripeGateway {
    public void sendStripePayment(double money) {
        System.out.println("Paid ₹" + money + " using Stripe.");
    }
}


class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPal;

    public PayPalAdapter(PayPalGateway payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayPalPayment(amount);
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.sendStripePayment(amount);
    }
}