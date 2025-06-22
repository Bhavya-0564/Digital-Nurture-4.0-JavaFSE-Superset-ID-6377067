# Strategy Pattern Example

This repository contains a simple Java example demonstrating the **Strategy Design Pattern**.

## Project Structure

- `PaymentStrategy.java`: Interface defining the strategy.
- `CreditCardPayment.java`: Concrete strategy for credit card payments.
- `PayPalPayment.java`: Concrete strategy for PayPal payments.
- `PaymentContext.java`: Context class that uses a `PaymentStrategy`.
- `StrategyPatternTest.java`: Main class to demonstrate the usage of the strategy pattern.

## How to Compile and Run

1.  **Compile the Java files:**
    ```bash
    javac *.java
    ```

2.  **Run the application:**
    ```bash
    java StrategyPatternTest
    ```

## Design Pattern: Strategy

<<<<<<< HEAD
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use. It allows the algorithm to be selected independently from clients that use it. In this example, the payment method (Credit Card or PayPal) is the strategy that can be swapped at runtime. 
=======
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use. It allows the algorithm to be selected independently from clients that use it. In this example, the payment method (Credit Card or PayPal) is the strategy that can be swapped at runtime. 
>>>>>>> 0a723bc (Initial commit for Week 1)
