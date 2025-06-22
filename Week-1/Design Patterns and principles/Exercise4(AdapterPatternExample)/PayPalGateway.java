package AdapterPatternExample;

public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("PayPal Gateway: Processing payment of $" + amount);
    }

    public void sendConfirmation() {
        System.out.println("PayPal Gateway: Sending payment confirmation.");
    }
} 