package com.di.dependencyInjection.controller;

import com.di.dependencyInjection.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService =  greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
