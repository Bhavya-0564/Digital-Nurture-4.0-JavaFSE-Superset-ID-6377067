# Adapter Pattern Example

This directory contains a Java example demonstrating the **Adapter Pattern**.

The Adapter Pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces, enabling them to collaborate without modifying their existing code.

## Files:

- `PaymentProcessor.java`: Defines the target interface that clients interact with.
- `PayPalGateway.java`: Represents an existing incompatible class (adaptee) that provides PayPal payment services.
- `PayPalAdapter.java`: Adapts the `PayPalGateway` to the `PaymentProcessor` interface.
- `StripeGateway.java`: Represents another existing incompatible class (adaptee) that provides Stripe payment services.
- `StripeAdapter.java`: Adapts the `StripeGateway` to the `PaymentProcessor` interface.
- `AdapterPatternTest.java`: A test class demonstrating how the adapters are used to process payments through different gateways using a common interface.

This example illustrates how the Adapter Pattern can be used to integrate different third-party payment gateways (PayPal and Stripe) into a unified payment processing system without changing the core logic of the client code or the payment gateways themselves.

## How to Run:

1.  **Compile the Java files:**
    ```bash
    javac *.java
    ```
2.  **Run the test class:**
    ```bash
    java AdapterPatternTest
<<<<<<< HEAD
    ``` 
=======
    ``` 
>>>>>>> 0a723bc (Initial commit for Week 1)
