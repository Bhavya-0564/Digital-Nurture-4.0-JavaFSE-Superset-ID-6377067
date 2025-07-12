# REST - Country Web Service

This project demonstrates a basic RESTful web service using Spring Framework that returns the details of a country (India) configured via Spring XML. The endpoint is exposed at:

```
http://localhost:8081/country
```

## Project Structure

- IDE Used: Eclipse
- Controller: com.cognizant.spring-learn.controller.CountryController
- Method: getCountryIndia()
- Annotation Used: @RequestMapping
- Bean Source: country.xml
- Port: 8081

## Functionality

The REST endpoint `/country` returns a Spring bean representing India from the XML configuration.

### Sample Request

```
GET http://localhost:8081/country
```

### Sample Response

```json
{
  "code": "IN",
  "name": "India"
}
```

## SME Questions Answered

### What happens in the controller method?

- The method is mapped using `@RequestMapping`.
- Spring XML is loaded using `ApplicationContext`.
- Bean with ID `"in"` is fetched and returned as a Java object.
- Spring automatically converts this object to a JSON response.

```java
@RequestMapping("/country")
public Country getCountryIndia() {
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country country = context.getBean("in", Country.class);
    return country;
}
```

### How is the bean converted into a JSON response?

- Spring uses Jackson (automatically configured via classpath).
- The returned `Country` object is serialized into JSON using an `HttpMessageConverter`.
- No need for manual conversion or JSON libraries.

## Tools Used

- Eclipse IDE
- Spring MVC (Spring Learn setup)
- Postman (Desktop)
- Chrome Developer Tools (Network tab)
- Spring XML Configuration (country.xml)

## Output Files Uploaded

1. Eclipse_Controller_Run.jpg - Eclipse console output showing Spring app start
2. Chrome_Browser_Country_API_Output.jpg - Browser GET response for /country
3. Postman_Country_API_Output.jpg - Postman Body tab showing 200 OK JSON response
4. DevTools_Network_Headers.jpg - Chrome Developer Tools -> Network tab showing HTTP headers

## How to Check Headers

### In Postman

- Send: `GET http://localhost:8081/country`
- Click the Headers tab (next to Body)
- You will see response headers like:

```
Content-Type: application/json
Content-Length: 33
Date: Thu, 11 Jul 2025 13:00:04 GMT
Connection: keep-alive
```

### In Chrome DevTools

- Open browser and visit: `http://localhost:8081/country`
- Press F12 → Go to Network tab → Refresh the page
- Click on the `/country` request → Go to Headers
- Under Response Headers, you will see:

```
content-type: application/json
content-length: 33
date: Thu, 11 Jul 2025 13:00:04 GMT
connection: keep-alive
```

## Status

- REST API Working
- JSON Response Generated via Spring
- Output validated via Postman and Browser
- HTTP Headers verified via DevTools and Postman
