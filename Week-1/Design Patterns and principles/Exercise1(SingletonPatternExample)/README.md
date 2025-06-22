# Singleton Pattern Example

This repository contains a simple Java example demonstrating the Singleton design pattern.

## Project Structure

- `Logger.java`: Implements the Singleton pattern to ensure that only one instance of the `Logger` class exists throughout the application. It provides a global point of access to log messages.
- `LoggerTest.java`: A test class that demonstrates the usage of the `Logger` Singleton.
- `OUTPUT.jpg`: An image showing the expected output when running the `LoggerTest`.

## Singleton Pattern Explained

The Singleton pattern is a creational design pattern that restricts the instantiation of a class to one "single" instance. This is useful when exactly one object is needed to coordinate actions across the system.

### Key Characteristics:

- **Private Constructor**: Prevents direct instantiation of the class from outside.
- **Static Method/Field**: Provides a global point of access to the single instance.

## How to Run

1. Compile the Java files:
   ```bash
   javac Logger.java LoggerTest.java
   ```
2. Run the test class:
   ```bash
   java LoggerTest
   ```

<<<<<<< HEAD
The output will demonstrate that both `logger1` and `logger2` variables in `LoggerTest` refer to the same instance of the `Logger` class. 
=======
The output will demonstrate that both `logger1` and `logger2` variables in `LoggerTest` refer to the same instance of the `Logger` class. 
>>>>>>> 0a723bc (Initial commit for Week 1)
