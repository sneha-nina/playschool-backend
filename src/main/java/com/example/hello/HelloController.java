package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Hello from PlaySchool Backend";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from PlaySchool Backend";
    }
}
