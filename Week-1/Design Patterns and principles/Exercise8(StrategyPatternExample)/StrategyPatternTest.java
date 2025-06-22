package StrategyPatternExample;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card Payment
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        context.setPaymentStrategy(creditCard);
        System.out.println("Executing Credit Card Payment:");
        context.executePayment(250.00);

        System.out.println("\n---\n");

        // Using PayPal Payment
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");
        context.setPaymentStrategy(payPal);
        System.out.println("Executing PayPal Payment:");
        context.executePayment(120.50);

        System.out.println("\n---\n");

        // Changing strategy at runtime
        System.out.println("Changing to Credit Card Payment again:");
        context.setPaymentStrategy(new CreditCardPayment("9876-5432-1098-7654", "Jane Smith"));
        context.executePayment(75.00);
    }
} 