package di.spring.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - Setter";
    }
}
