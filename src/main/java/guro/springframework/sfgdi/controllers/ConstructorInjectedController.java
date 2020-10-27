package guro.springframework.sfgdi.controllers;

import guro.springframework.sfgdi.services.GreetingService;

/**
 * Created by omer on 27/10/2020
 */

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
