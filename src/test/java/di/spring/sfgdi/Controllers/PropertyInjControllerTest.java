package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting()); // make sure this method runs
    }
}