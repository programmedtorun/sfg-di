package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
