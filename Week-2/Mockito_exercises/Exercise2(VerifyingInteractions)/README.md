# Exercise 2: Verifying Interactions with Mockito

This project demonstrates how to use **Mockito** to verify that a method was called with the expected arguments.  
The goal is to ensure that a service class (`MyService`) interacts correctly with its dependency (`ExternalApi`) by verifying method calls.

The project was implemented using **Visual Studio Code (VS Code)** with **JUnit 5** and **Mockito**.

---

## What I Did

- Created a Maven-based Java project in **VS Code**
- Added **Mockito** and **JUnit 5** as dependencies in `pom.xml`
- Created a test class (`MyServiceTest`) to:
  - Mock an external API (`ExternalApi`)
  - Inject the mock into `MyService`
  - Call the method `fetchData()`
  - Use `verify()` to confirm that `mockApi.getData()` was called

---

## Tools & Technologies

- Java (JDK 8+)
- Visual Studio Code
- Maven
- JUnit 5
- Mockito

---

## Project Structure

Exercise2(VerifyingInteractions)/
├── pom.xml
└── src/
├── main/
│ └── java/
│ ├── ExternalApi.java # Interface to be mocked
│ └── MyService.java # Class under test
└── test/
└── java/
└── MyServiceTest.java # Test class using verify()