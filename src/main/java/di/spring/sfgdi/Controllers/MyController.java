package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by patrickskelley on Apr, 2020
 */

// creates a new instance of class using @controller annotation an
// put it into the context.
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
