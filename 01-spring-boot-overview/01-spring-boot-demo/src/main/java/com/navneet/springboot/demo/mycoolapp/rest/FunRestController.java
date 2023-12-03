package com.navneet.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // Expose the endpoint "/"

    @GetMapping("/")
    public String sayHello() {
        return "Hello world!";
    }
}
