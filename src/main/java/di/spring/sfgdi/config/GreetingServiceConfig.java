package di.spring.sfgdi.config;

import di.spring.sfgdi.services.GreetingRepository;
import di.spring.sfgdi.services.GreetingService;
import di.spring.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by patrickskelley on Apr, 2020
 */



@Configuration
public class GreetingServiceConfig {

    // default scope for beans in spring is singleton
    // note: you can create custom bean scopes in spring. ie. prototype scope: spring will create a new
    // instance of the bean for every obj requesting it
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean // instead of service being annotated in the class PrimaryGreetingService we have @Bean in config class
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es") // change profiles in resources/application.properties
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }


}
