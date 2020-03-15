package com.di.dependencyInjection.controller;

import com.di.dependencyInjection.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHelloWorld() {

        return  greetingService.sayGreeting();
    }
}
