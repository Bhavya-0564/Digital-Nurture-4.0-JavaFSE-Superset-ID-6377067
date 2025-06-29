# Exercise 4: Arrange-Act-Assert (AAA) Pattern with Setup and Teardown in JUnit

This project demonstrates how to write well-structured unit tests in **JUnit** using the **Arrange-Act-Assert (AAA)** pattern along with **setup and teardown methods** using `@Before` and `@After` annotations.

The implementation was done using **Eclipse IDE** and **Maven**.

---

## What I Did

- Created a Maven-based Java project using **Eclipse IDE**
- Followed the **Arrange-Act-Assert (AAA)** pattern in unit test methods
- Used JUnit annotations:
  - `@Before` to run code before each test (setup)
  - `@After` to run code after each test (teardown)
- Ensured test cases were isolated and maintainable

---

## Tools & Technologies

- **Java** (JDK 8+)
- **Eclipse IDE**
- **Maven** (build system)
- **JUnit 4.13.2**

---

##  Project Structure

Exercise4(Arrange-Act-Assert(AAA)Pattern,TestFixtures,Setup_And_Teardown_Methods_in_JUnit)/
├── pom.xml
└── src/
├── main/
│ └── java/
│ └── Calculator.java # Sample class under test
└── test/
└── java/
└── CalculatorTest.java # Test class using AAA, @Before, @After

---

## Testing Approach

### Arrange-Act-Assert (AAA) Pattern

Each test method was written in three clear steps:
1. **Arrange** – set up test data or environment
2. **Act** – perform the operation to be tested
3. **Assert** – verify the result

### Setup and Teardown

- `@Before`: Executed **before each test method**
- `@After`: Executed **after each test method**

This helped manage reusable setup logic and clean up after each test case.

---

## ▶️ How I Ran the Tests

### Using Eclipse:

- Right-clicked on the test class
- Selected **Run As → JUnit Test**
- Verified output in the **JUnit View**

### Using Maven:

```bash
mvn test

