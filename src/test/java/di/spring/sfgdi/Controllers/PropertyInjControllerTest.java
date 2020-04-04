package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by patrickskelley on Apr, 2020
 */
class PropertyInjControllerTest {

    PropertyInjController controller;

    // in junit test and setting up test condition.
    // mimicking what spr frm would be doing, - setting up controller
    //
    @BeforeEach
    void setUp(){
        controller = new PropertyInjController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting()); // make sure this method runs
    }
}