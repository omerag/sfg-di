package guro.springframework.sfgdi.controllers;

import guro.springframework.sfgdi.services.GreetingService;

/**
 * Created by omer on 25-Oct-20.
 */

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
