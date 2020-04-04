package di.spring.sfgdi.Controllers;

import di.spring.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by patrickskelley on Apr, 2020
 */
class ConstructorInjControllerTest {

    ConstructorInjController constructorInjController;


    // acting as inversion controll in the setup methods of j-unit.
    @BeforeEach
    void setUp() {
        constructorInjController = new ConstructorInjController(new GreetingServiceImpl()); // new consinjcont and
        // creating a new greeting svc
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjController.getGreeting());
    }
}