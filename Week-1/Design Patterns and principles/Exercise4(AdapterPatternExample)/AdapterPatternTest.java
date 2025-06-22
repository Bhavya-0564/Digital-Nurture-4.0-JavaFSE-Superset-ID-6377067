package AdapterPatternExample;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Using PayPal through the adapter
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        System.out.println("Processing payment via PayPal Adapter:");
        payPalProcessor.processPayment(100.00);

        System.out.println("\n---\n");

        // Using Stripe through the adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        System.out.println("Processing payment via Stripe Adapter:");
        stripeProcessor.processPayment(250.75);
    }
} 