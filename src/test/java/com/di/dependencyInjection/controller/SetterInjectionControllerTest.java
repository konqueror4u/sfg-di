package com.di.dependencyInjection.controller;

import com.di.dependencyInjection.service.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {
    SetterInjectionController controller;

    @BeforeEach
    void setup(){
        controller =  new SetterInjectionController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}