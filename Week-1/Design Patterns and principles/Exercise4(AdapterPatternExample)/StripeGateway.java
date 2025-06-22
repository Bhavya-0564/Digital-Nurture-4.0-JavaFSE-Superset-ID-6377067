package AdapterPatternExample;

public class StripeGateway {
    public void charge(double amount) {
        System.out.println("Stripe Gateway: Charging $" + amount);
    }

    public void generateReceipt() {
        System.out.println("Stripe Gateway: Generating receipt.");
    }
} 