# JWT Authentication Service using Spring Boot

This project demonstrates a **simple JWT-based authentication service** using **Spring Boot 3.x**, where a token is returned by posting user credentials using **Basic Authentication** (`-u user:pwd`).

---

## Project Structure

```
src/
├── main/
│   ├── java/com/example/jwt/
│   │   ├── JwtAuthServiceApplication.java
│   │   ├── controller/AuthController.java
│   │   ├── util/JwtUtil.java
│   │   └── config/SecurityConfig.java
```

---

## Steps to Execute

### 1. Clone or Open in Eclipse

Make sure Java 17+ is configured.

```bash
git clone <your-repo-url>
cd jwt-auth-service
```

### 2. Build the Project

Use Eclipse Maven build, or:

```bash
./mvnw clean install
```

### 3. Run the Spring Boot App

You can run from `JwtAuthServiceApplication.java` or:

```bash
./mvnw spring-boot:run
```

Make sure port `8090` is available.

---

## Test the API (Basic Auth)

Use `curl` to test the `/authenticate` endpoint:

```bash
curl -X POST -u user:pwd http://localhost:8090/authenticate
```
 Expected output:

```json
{"token":"<jwt-token-here>"}
```

---

##  How It Works 

###  1. Authentication Controller (`AuthController.java`)

```java
@PostMapping("/authenticate")
public ResponseEntity<?> authenticate(HttpServletRequest request) {
    String authHeader = request.getHeader("Authorization");
    if (authHeader != null && authHeader.startsWith("Basic ")) {
        String base64Credentials = authHeader.substring("Basic ".length()).trim();
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        String[] values = credentials.split(":", 2);
        if ("user".equals(values[0]) && "pwd".equals(values[1])) {
            String token = jwtUtil.generateToken(values[0]);
            return ResponseEntity.ok("{\"token\":\"" + token + "\"}");
        }
    }
    return ResponseEntity.status(401).body("Unauthorized");
}
```

###  2. Token Generator (`JwtUtil.java`)

```java
public String generateToken(String username) {
    return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
            .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()), SignatureAlgorithm.HS256)
            .compact();
}
```

###  3. Security Config (`SecurityConfig.java`)

```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
            .requestMatchers(HttpMethod.POST, "/authenticate").permitAll()
            .anyRequest().authenticated()
        )
        .httpBasic(Customizer.withDefaults());
    return http.build();
}
```

---

##  Output

```bash
curl -X POST -u user:pwd http://localhost:8090/authenticate

{"token":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNzI4NzY1NzAwLCJleHAiOjE3Mjg3OTQ1MDB9.abc.def.ghi"}
```

---

```

