package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingService;

/**
 * Created by patrickskelley on Apr, 2020
 */
public class SetterInjController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this. greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
