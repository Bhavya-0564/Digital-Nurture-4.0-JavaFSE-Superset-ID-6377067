package StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy {
    private String emailId;

    public PayPalPayment(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using PayPal. Email ID: " + emailId);
    }
} 