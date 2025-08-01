package com.example.hellorestapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("START: sayHello()");
        String message = "Hello from Spring REST!";
        LOGGER.info("END: sayHello()");
        return message;
    }
}
