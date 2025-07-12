# Create a Spring Web Project using Maven

This project demonstrates how to create and run a Spring Boot web application using Maven. The steps follow the instructions provided in the Digital Nurture Java FSE training.

## Project Details

- Group ID: com.cognizant
- Artifact ID: spring-learn
- Dependencies:
  - Spring Web
  - Spring Boot DevTools

## Steps Followed

1. Open https://start.spring.io/
2. Set Group as "com.cognizant"
3. Set Artifact as "spring-learn"
4. Add the following dependencies:
   - Spring Web
   - Spring Boot DevTools
5. Generate and download the ZIP file
6. Extract the ZIP into the Eclipse workspace
7. Open Command Prompt and navigate to the extracted folder
8. Build the project using the following Maven command:
   mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=6355067
9. Open Eclipse and import the project:
- Go to File > Import > Maven > Existing Maven Projects
- Browse and select the extracted folder
- Click Finish
10. Open SpringLearnApplication.java and add a log message in the main method:
 ```java
 System.out.println("SpringLearnApplication started successfully!");
 ```
11. Right-click the class and run as Java Application
12. Verify the console output

## Project Structure

- `src/main/java`: Contains application source code
- `src/main/resources`: Contains configuration files such as `application.properties`
- `src/test/java`: Contains test classes
- `SpringLearnApplication.java`: Main class with the `main()` method

## Explanation of Key Concepts

- `@SpringBootApplication`: This annotation enables auto-configuration, component scanning, and configuration support. It combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`.

- `pom.xml`: The Maven build file that includes project information and dependencies. It also includes plugin configurations and the dependency hierarchy.

## What I Learned

- How to use Spring Initializr to generate a project
- How to add dependencies like Spring Web and DevTools
- How to build a project using Maven from the command line with proxy settings
- How to import and run a Maven project in Eclipse
- Understanding of `@SpringBootApplication` annotation
- Familiarity with project structure and Maven `pom.xml` configuration

