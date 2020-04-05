package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Controller
public class ConstructorInjController {

    // use final. once injected can't be modifies.
    private final GreetingService greetingService;

    // do not need to @Autowire as of Spring 5

    // @Qualifier: bean name is class name with leading lowercase, defines which
    // class implmentation of greeting service to use
    public ConstructorInjController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
