# Exercise 3: Assertions in JUnit

This project demonstrates the use of different assertions in **JUnit** to validate test results.  
The setup and execution were completed using **Eclipse IDE** with **Maven**.

---

## What I Did

- Created a new Maven project in **Eclipse IDE**.
- Added **JUnit 4.13.2** as a test dependency in the `pom.xml`.
- Created a test class inside the `src/test/java` directory.
- Wrote multiple unit tests using different types of assertions:
  - `assertEquals`
  - `assertTrue`
  - `assertFalse`
  - `assertNull`
  - `assertNotNull`
- Ran the tests using:
  - **JUnit Test Runner** inside Eclipse
  - Maven command: `mvn test` (optional)

---

## Tools & Technologies

- **Java** (JDK 8+)
- **Eclipse IDE**
- **Maven** (build tool)
- **JUnit 4.13.2** (testing framework)

---

## Project Structure

Exercise3(Assertions_in_JUnit)/
├── pom.xml
└── src/
├── main/
│ └── java/
│ └── App.java # Placeholder (optional)
└── test/
└── java/
└── AssertionsTest.java # Contains assertion test cases

---

## ▶️ How I Ran the Tests

### Using Eclipse

1. Right-clicked the test file in Project Explorer (`AssertionsTest.java`)
2. Selected **Run As → JUnit Test**
3. Viewed results in the **JUnit pane** (all green)

---

## ✅ Outcome

- All test cases passed successfully.
- Verified that all five types of assertions work correctly.
- Understood how to organize unit tests inside a Maven project using Eclipse.

---
