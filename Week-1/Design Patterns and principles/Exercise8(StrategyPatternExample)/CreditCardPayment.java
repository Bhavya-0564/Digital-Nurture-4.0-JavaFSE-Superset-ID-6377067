package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String nameOnCard;

    public CreditCardPayment(String cardNumber, String nameOnCard) {
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card. Card Number: " + cardNumber);
    }
} 