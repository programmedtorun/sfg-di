package di.spring.sfgdi.Controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by patrickskelley on Apr, 2020
 */

// creates a new instance of class using @controller annotation an
// put it into the context.
@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!");
        return "Hi Folks!";
    }
}
