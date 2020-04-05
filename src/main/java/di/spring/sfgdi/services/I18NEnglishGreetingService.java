package di.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Profile({"EN", "default"}) // designates profile and class to be loaded into context via application properties file
@Service("i18NService")
public class I18NEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - EN";
    }
}
