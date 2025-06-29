# JUnit Setup Exercise

This repository demonstrates how to set up and run unit tests using **JUnit** in a **Java Maven project** created with **Eclipse IDE**.

---

## Project Setup

### 1. Created Using

- **Eclipse IDE**
- **Java (JDK 8 or higher)**
- **Maven build system**

### JUnit Dependency

The project uses **JUnit 4.13.2** for testing.  
Added in `pom.xml` under `<dependencies>`:

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>


Exercise1(SettingUpJUnit)/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── App.java
    └── test/
        └── java/
            └── AppTest.java
