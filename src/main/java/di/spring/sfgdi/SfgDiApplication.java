package di.spring.sfgdi;

import di.spring.sfgdi.Controllers.ConstructorInjController;
import di.spring.sfgdi.Controllers.MyController;
import di.spring.sfgdi.Controllers.PropertyInjController;
import di.spring.sfgdi.Controllers.SetterInjController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
        // getting a handle on application context via ctx var.
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        // not creating a controller but asking context for an instance of this bean
        // asking context for controller. did not ever say "new Controller"
        // spring framework managing construction of controller. simply asking spring for
        // the object.
        MyController myController = (MyController) ctx.getBean("myController");

        // getting return value in greeting.
        String greeting = myController.sayHello();

        // printing out greeting rval
        System.out.println(greeting);

        System.out.println("-------------Property");
        PropertyInjController propertyInjController = (PropertyInjController) ctx.getBean("propertyInjController");
        System.out.println(propertyInjController.getGreeting());

        System.out.println("-------------Setter");
        SetterInjController setterInjController = (SetterInjController) ctx.getBean("setterInjController");
        System.out.println(setterInjController.getGreeting());

        System.out.println("---------Constructor");
        ConstructorInjController constructorInjController = (ConstructorInjController) ctx.getBean("constructorInjController");
        System.out.println(constructorInjController.getGreeting());
    }

}
