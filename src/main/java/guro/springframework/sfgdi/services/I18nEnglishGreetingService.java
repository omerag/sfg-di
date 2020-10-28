package guro.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by omer on 28-Oct-20.
 */

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}

