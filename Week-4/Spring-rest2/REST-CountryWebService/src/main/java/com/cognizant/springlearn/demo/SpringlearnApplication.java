package com.cognizant.springlearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cognizant.springlearn")
public class SpringlearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringlearnApplication.class, args);
    }
}
