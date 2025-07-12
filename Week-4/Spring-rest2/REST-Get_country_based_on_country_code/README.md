# Spring Boot - Country REST Web Service

This Spring Boot application exposes a RESTful web service that returns country details based on the country code (case-insensitive). The country data is loaded from a Spring XML configuration file using `ClassPathXmlApplicationContext`.

## Project Structure

springlearn1/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/hellorestapp/
│   │   │       ├── Springlearn1Application.java           # Main Spring Boot application class
│   │   │       ├── controller/
│   │   │       │   └── CountryController.java             # REST Controller
│   │   │       ├── model/
│   │   │       │   └── Country.java                       # POJO model class
│   │   │       └── service/
│   │   │           └── CountryService.java                # Service to fetch country by code
│   └── resources/
│       ├── application.properties                         # Port configuration
│       └── country.xml                                    # Country list defined in XML
├── pom.xml                                                # Maven project file

## How It Works

- The REST endpoint `/country/{code}` accepts a country code as a path variable.
- The application loads country data from `country.xml` using Spring's XML bean configuration.
- The `CountryService` searches the list for a country with a code that matches (case-insensitive).
- The matching country object is returned as a JSON response.

## REST Endpoint

GET http://localhost:8083/country/{code}

Example:
GET http://localhost:8083/country/in

### Response

{
  "code": "IN",
  "name": "India"
}

## Output 

1. Browser Output

Open the following URL:
http://localhost:8083/country/in

You should see:
{
  "code": "IN",
  "name": "India"
}

2. Eclipse Console Output

The console should show:
Tomcat started on port(s): 8083
Started Springlearn1Application...

## country.xml

This XML file contains the list of countries used in the application.

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
                           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="countryList" class="java.util.ArrayList">
        <constructor-arg>
            <list>
                <bean class="com.example.hellorestapp.model.Country">
                    <property name="code" value="IN"/>
                    <property name="name" value="India"/>
                </bean>
                <bean class="com.example.hellorestapp.model.Country">
                    <property name="code" value="US"/>
                    <property name="name" value="United States"/>
                </bean>
                <bean class="com.example.hellorestapp.model.Country">
                    <property name="code" value="CN"/>
                    <property name="name" value="China"/>
                </bean>
            </list>
        </constructor-arg>
    </bean>

</beans>

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Maven
- XML-based Bean Configuration

## How to Run the Application

1. Import the project into Eclipse as a Maven project.
2. Run `Springlearn1Application.java` as a Java application.
3. Open your browser or Postman.
4. Use the following URL to test:
   http://localhost:8083/country/in

## Notes

- The XML file must be placed in `src/main/resources`.
- Matching is case-insensitive using `equalsIgnoreCase`.
- You can extend the XML file to include more countries.
- JSON conversion is handled automatically by Spring Boot (using Jackson).


