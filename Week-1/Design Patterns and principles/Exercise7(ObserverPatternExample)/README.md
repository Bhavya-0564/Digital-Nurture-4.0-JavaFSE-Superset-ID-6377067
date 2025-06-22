# Observer Pattern Example

This repository contains a Java implementation demonstrating the **Observer Pattern**. The Observer Pattern is a behavioral design pattern that allows an object, called the subject, to notify other objects, called observers, about changes in its state.

## Project Structure

The project consists of the following Java files:

*   `Observer.java`: An interface defining the contract for observer objects.
*   `Stock.java`: A simple data class representing a stock with its name and price.
*   `StockMarket.java`: The concrete subject class. It maintains a list of observers (mobile apps and web apps) and notifies them whenever the stock price changes.
*   `MobileApp.java`: A concrete observer class representing a mobile application that updates its display when stock prices change.
*   `WebApp.java`: A concrete observer class representing a web application that updates its display when stock prices change.
*   `ObserverPatternTest.java`: The main class to demonstrate the Observer Pattern. It creates a `StockMarket` subject, registers `MobileApp` and `WebApp` observers, and simulates stock price changes to show notifications.

## How to Compile and Run

To compile and run this Java application, follow these steps:

1.  **Navigate to the project directory**:
    ```bash
    cd Exercise7(ObserverPatternExample)
    ```

2.  **Compile the Java files**:
    ```bash
    javac *.java
    ```

3.  **Run the main application**:
    ```bash
    java ObserverPatternTest
    ```

## Example Output

<<<<<<< HEAD
The `OUTPUT.jpg` file in this repository shows an example of the program's console output, illustrating how observers are notified of stock price changes. 
=======
The `OUTPUT.jpg` file in this repository shows an example of the program's console output, illustrating how observers are notified of stock price changes. 
>>>>>>> 0a723bc (Initial commit for Week 1)
