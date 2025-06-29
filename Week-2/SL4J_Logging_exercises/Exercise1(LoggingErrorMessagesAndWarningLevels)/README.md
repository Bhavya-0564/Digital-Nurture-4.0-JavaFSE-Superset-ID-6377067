# Exercise 1: Logging with SLF4J and Logback

This project demonstrates how to log **error** and **warning** messages in a Java application using the **SLF4J** API with **Logback** as the logging backend.

The project was implemented using **VS Code** and built using **Maven**.

---

## What I Did

- Created a Maven-based Java project in **VS Code**
- Added dependencies for **SLF4J API** and **Logback Classic**
- Wrote a simple Java class to:
  - Log an error message using `logger.error(...)`
  - Log a warning message using `logger.warn(...)`

---

## Tools & Technologies

- Java (JDK 8+)
- Visual Studio Code
- Maven
- SLF4J (Simple Logging Facade for Java)
- Logback (Logging implementation)

---

## Project Structure

Exercise1(LoggingErrorMessagesAndWarningLevels)/
├── pom.xml
└── src/
└── main/
└── java/
└── LoggingExample.java # Contains logger calls