package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Controller
public class ConstructorInjController {

    // use final. once injected can't be modifies.
    private final GreetingServiceImpl greetingServiceImpl;

    // do not need to @Autowire as of Spring 5
    public ConstructorInjController(GreetingServiceImpl greetingServiceImpl) {
        this.greetingServiceImpl = greetingServiceImpl;
    }

    public String getGreeting(){
        return greetingServiceImpl.sayGreeting();
    }
}
