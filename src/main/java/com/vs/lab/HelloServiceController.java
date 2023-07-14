package com.vs.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {

    private final HelloService myService;
    
    public HelloServiceController(HelloService myService) {
        this.myService = myService;
    }

    @GetMapping("/hello")
    public String hello() {
        return myService.getMessage();
    }
}
