package guro.springframework.sfgdi.controllers;

import guro.springframework.sfgdi.services.GreetingService;

/**
 * Created by omer on 27-Oct-20.
 */

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
