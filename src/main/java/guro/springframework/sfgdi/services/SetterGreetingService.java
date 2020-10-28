package guro.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by omer on 25-Oct-20.
 */

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
