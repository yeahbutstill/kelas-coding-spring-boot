package com.yeahbutstill.junit.springin5step;

import com.yeahbutstill.junit.springin5step.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoRestApiCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoRestApiCDIApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoRestApiCDIApplication.class)) {

            SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

            LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDAO());

        }

    }

}
