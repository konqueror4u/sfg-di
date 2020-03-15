package com.di.dependencyInjection.controller;

import com.di.dependencyInjection.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
      return greetingService.sayGreeting();
    }
}
