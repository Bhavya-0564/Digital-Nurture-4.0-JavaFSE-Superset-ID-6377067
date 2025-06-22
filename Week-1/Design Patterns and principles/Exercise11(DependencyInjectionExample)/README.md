# Dependency Injection Example

This folder contains a simple Java example demonstrating the **Dependency Injection** design principle.

## What is Dependency Injection?

Dependency Injection (DI) is a design pattern that allows for the creation of dependent objects outside of a class and provides those objects to a class through different means (e.g., constructor, setter methods, or interface injection). This helps in achieving loose coupling between components and makes the code more modular, testable, and maintainable.

## Project Structure

- `CustomerRepository.java`: Interface defining the contract for customer data operations.
- `CustomerRepositoryImpl.java`: Concrete implementation of `CustomerRepository`.
- `CustomerService.java`: Class that depends on `CustomerRepository`.
- `DependencyInjectionTest.java`: Main class to demonstrate the dependency injection by injecting `CustomerRepositoryImpl` into `CustomerService`.

## How it Works

In this example:
1. `CustomerService` *depends* on `CustomerRepository` to perform its operations.
2. Instead of `CustomerService` creating an instance of `CustomerRepositoryImpl` itself (which would lead to tight coupling), an instance of `CustomerRepositoryImpl` is *injected* into `CustomerService`.
3. This injection is typically done in `DependencyInjectionTest.java` (or an equivalent "client" or "injector" class), showcasing how `CustomerService` receives its dependency rather than creating it.

<<<<<<< HEAD
This approach makes it easy to swap out `CustomerRepositoryImpl` with another implementation (e.g., a mock for testing) without modifying the `CustomerService` class itself. 
=======
This approach makes it easy to swap out `CustomerRepositoryImpl` with another implementation (e.g., a mock for testing) without modifying the `CustomerService` class itself. 
>>>>>>> 0a723bc (Initial commit for Week 1)
