package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingService;

/**
 * Created by patrickskelley on Apr, 2020
 */
public class PropertyInjController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
