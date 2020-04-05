package di.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Profile("ES")
@Service("i18NService")
public class I18NSpanishGretingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
