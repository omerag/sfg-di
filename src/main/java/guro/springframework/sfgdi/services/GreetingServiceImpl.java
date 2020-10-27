package guro.springframework.sfgdi.services;

/**
 * Created by omer on 25-Oct-20.
 */

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
