package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingService;

/**
 * Created by patrickskelley on Apr, 2020
 */
public class ConstructorInjController {

    // use final once injected can't be modifies. 
    private final GreetingService greetingService;

    public ConstructorInjController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
