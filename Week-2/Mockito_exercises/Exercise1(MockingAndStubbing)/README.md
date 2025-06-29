# Exercise 1: Mocking and Stubbing with Mockito

This project demonstrates how to use **Mockito** for mocking and stubbing external dependencies in unit tests.  
The exercise simulates a scenario where a service class (`MyService`) relies on an external API (`ExternalApi`), which is mocked in the test using **Mockito**.

The project was built and tested using **Visual Studio Code (VS Code)**, **Maven**, and **JUnit 5**.

---

## What I Did

- Created a Maven-based Java project using **VS Code**
- Added **JUnit 5** and **Mockito** dependencies to the `pom.xml` file
- Defined a mock of the `ExternalApi` interface
- Stubbed the method `getData()` to return `"Mock Data"`
- Injected the mock into the `MyService` class
- Wrote and ran a test to assert that the service correctly used the mock

---

## Tools & Technologies

- Java (JDK 8+)
- Visual Studio Code (with Java extensions)
- Maven (build automation)
- JUnit 5 (unit testing framework)
- Mockito (mocking framework)

---

## Project Structure

Exercise1(MockingAndStubbing)/
├── pom.xml
└── src/
├── main/
│ └── java/
│ ├── ExternalApi.java # Interface to be mocked
│ └── MyService.java # Service class under test
└── test/
└── java/
└── MyServiceTest.java # Test class using Mockito

---

##  Maven Dependencies

Add the following to your `pom.xml` inside the `<dependencies>` section:

```xml
<!-- JUnit 5 -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
</dependency>

<!-- Mockito -->
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.2.0</version>
    <scope>test</scope>
</dependency>
