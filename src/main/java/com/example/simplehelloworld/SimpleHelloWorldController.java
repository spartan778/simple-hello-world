package com.example.simplehelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class SimpleHelloWorldController {

        @GetMapping("/")
        public String index() {
            return "Hello World!";
        }
    }
