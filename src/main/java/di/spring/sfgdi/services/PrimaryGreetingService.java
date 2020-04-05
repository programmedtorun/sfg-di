package di.spring.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by patrickskelley on Apr, 2020
 */

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World == I am the all powerful PRIMARY BEAN!!!!!!!!!";
    }
}
