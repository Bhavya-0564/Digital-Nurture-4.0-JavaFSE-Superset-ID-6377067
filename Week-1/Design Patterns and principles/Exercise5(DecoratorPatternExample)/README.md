# Decorator Pattern Example

This repository contains a Java implementation of the Decorator Design Pattern. The example demonstrates how to dynamically add new functionalities to an object without altering its structure.

## Project Structure

- `Notifier.java`: Defines the base interface for sending notifications.
- `EmailNotifier.java`: A concrete implementation of `Notifier` that sends email notifications.
- `NotifierDecorator.java`: An abstract decorator class that implements the `Notifier` interface and holds a reference to a `Notifier` object.
- `SMSNotifierDecorator.java`: A concrete decorator that adds SMS notification functionality.
- `SlackNotifierDecorator.java`: A concrete decorator that adds Slack notification functionality.
- `DecoratorPatternTest.java`: The main class demonstrating the usage of the Decorator pattern by combining different notification types.

## How to Compile and Run

To compile the Java files, navigate to the root directory of the project in your terminal and run:

```bash
javac DecoratorPatternExample/*.java
```

To run the example, execute the `DecoratorPatternTest` class:

```bash
java DecoratorPatternExample.DecoratorPatternTest
```

## Output

<<<<<<< HEAD
The `OUTPUT.jpg` file contains a screenshot of the expected console output when running the `DecoratorPatternTest` class. 
=======
The `OUTPUT.jpg` file contains a screenshot of the expected console output when running the `DecoratorPatternTest` class. 
>>>>>>> 0a723bc (Initial commit for Week 1)
