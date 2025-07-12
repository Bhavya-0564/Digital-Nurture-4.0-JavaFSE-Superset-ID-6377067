# Spring Core – Load Country from Spring Configuration XML

This project demonstrates the use of **Spring Core** with **XML-based configuration** to load and manage a Java bean representing a country. It simulates a scenario for an airline booking system that supports multiple countries.

---

## Problem Statement

An airline website needs to support booking for four countries (US, DE, IN, JP). Each country has:
- A **two-letter ISO code**
- A **country name**

This information must be stored in a Spring XML configuration file. The application reads and logs this data using Spring’s ApplicationContext.

---

## Project Structure

```plaintext
spring-learn/
├── pom.xml
├── README.md
└── src
    └── main
        ├── java
        │   └── com
        │       └── cognizant
        │           └── springlearn
        │               ├── Country.java
        │               └── SpringLearnApplication.java
        └── resources
            ├── country.xml
            └── simplelogger.properties
```

---

## Technologies Used

- Java 17
- Spring Core (XML Configuration)
- Maven
- SLF4J (SimpleLogger)
- Eclipse IDE

---

## What I Did

- Created a Maven project in Eclipse
- Defined a `Country` class with `code` and `name` properties
- Created a Spring XML configuration file (`country.xml`) to define a bean for `Country`
- Loaded the bean using `ClassPathXmlApplicationContext` in `SpringLearnApplication`
- Logged constructor and getter/setter method calls using SLF4J
- Created a logger configuration file (`simplelogger.properties`) to enable debug-level logging

---

## What I Learned

- How to create and configure Spring beans using XML
- How Spring's ApplicationContext loads and manages beans
- How to inject values using the `<property>` tag in XML
- How to use SLF4J with SimpleLogger for logging
- How to structure a Spring Core project using Maven and Eclipse

---

## How to Run

1. Import the project into Eclipse as a Maven project
2. Run `SpringLearnApplication.java` as a Java application
3. View the console logs to see Spring bean lifecycle in action

