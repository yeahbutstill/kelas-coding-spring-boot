package com.yeahbutstill.springin5step;

import com.yeahbutstill.springin5step.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties") // app.properties
public class DemoRestApiPropertiesApplication {

    public static void main(String[] args) {

        // Application Context
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoRestApiPropertiesApplication.class)) {

            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
            System.out.println(service.returnServiceURL());

        }

    }

}
