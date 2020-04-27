package di.spring.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
