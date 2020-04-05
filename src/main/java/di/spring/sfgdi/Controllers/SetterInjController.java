package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Controller
public class SetterInjController {


    private GreetingService greetingService;

    @Autowired// on setter need autowired and it's gonna tell spring that we want a greeting svc injected into being
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService){
        this. greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
