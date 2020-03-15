package com.di.dependencyInjection.controller;

import com.di.dependencyInjection.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;


}
