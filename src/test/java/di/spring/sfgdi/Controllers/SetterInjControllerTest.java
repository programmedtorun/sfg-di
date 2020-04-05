package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by patrickskelley on Apr, 2020
 */
class SetterInjControllerTest {

    SetterInjController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjController();
        controller.setGreetingService(new ConstructorGreetingService()); // using setter to inj greeting sevc implementation

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}