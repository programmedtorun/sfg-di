package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by patrickskelley on Apr, 2020
 */
class SetterInjControllerTest {

    SetterInjController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjController();
        controller.setGreetingService(new GreetingServiceImpl()); // using setter to inj greeting sevc implementation

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}