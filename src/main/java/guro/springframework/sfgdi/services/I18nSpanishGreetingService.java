package guro.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by omer on 28-Oct-20.
 */

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hold Mundo - ES";
    }
}

