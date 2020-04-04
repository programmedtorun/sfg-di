package di.spring.sfgdi.services;

/**
 * Created by patrickskelley on Apr, 2020
 */
public class GreetingServiceImpl implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
