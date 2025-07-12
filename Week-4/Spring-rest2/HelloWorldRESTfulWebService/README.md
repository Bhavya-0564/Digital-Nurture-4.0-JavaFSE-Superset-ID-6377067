# Hello World - RESTful Web Service

This project demonstrates a simple RESTful web service using the Spring Web Framework that returns a plain text response: `Hello World!!`

## Project Configuration

- **IDE Used**: Eclipse
- **Port**: 9090
- **Controller Class**: `com.cognizant.spring-learn.controller.HelloController`
- **Method**: `sayHello()`
- **Annotation Used**: `@RequestMapping`
- **Return Type**: `String`

## Method Implementation

```java
@RequestMapping("/hello")
public String sayHello() {
    LOGGER.info("START");
    LOGGER.info("END");
    return "Hello World!!";
}
```

## Sample Request

```
GET http://localhost:9090/hello
```

## Sample Response

```
Hello World!!
```

## Required Output Screenshots

### 1. Chrome Browser Output

- Open `http://localhost:9090/hello` in Chrome.
- Take a screenshot showing the plain text output `Hello World!!`.

### 2. Developer Tools - Network Tab

- Open Chrome Developer Tools → Network tab.
- Refresh the page `http://localhost:9090/hello`.
- Click the `/hello` entry in the list.
- Take a screenshot that clearly shows:
  - **Request URL**
  - **Request Method (GET)**
  - **Status Code (200 OK)**
  - **Response Headers** like `Content-Type: text/plain`

### 3. Postman Output

- Open Postman and make a **GET** request to `http://localhost:9090/hello`.
- Take a screenshot of:
  - The **response output** ("Hello World!!")
  - The **Headers tab** showing headers like:
    - `Content-Type`
    - `Content-Length`
    - `Date`
    - `Server`

## Explanation for SME

### What happens in the controller method?

- The `sayHello()` method is mapped to the `/hello` URL.
- When a GET request is made to `/hello`, the method is invoked.
- The method logs "START" and "END" using a logger and returns the string `"Hello World!!"` as the response.

### How is the response returned?

- Since the method returns a `String`, Spring automatically sends the response as plain text with `Content-Type: text/plain`.

### Developer Tools - Network Tab

- You can verify the HTTP response headers under the **Network** tab in browser DevTools.
- Important headers include:
  - `Content-Type: text/plain`
  - `Status: 200 OK`

### Postman Headers

- In Postman, switch to the **Headers** tab of the response to view key HTTP headers:
  - `Content-Type: text/plain`
  - `Content-Length`
  - `Date`
  - `Server`

