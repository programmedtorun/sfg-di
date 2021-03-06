package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by patrickskelley on Apr, 2020
 */
@Controller
public class PropertyInjController {

    @Autowired
    @Qualifier("propertyInjGreetingService")
    public GreetingService greetingService;


    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
