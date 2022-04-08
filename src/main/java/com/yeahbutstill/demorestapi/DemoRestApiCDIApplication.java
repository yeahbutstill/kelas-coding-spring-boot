package com.yeahbutstill.demorestapi;

import com.yeahbutstill.demorestapi.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoRestApiCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoRestApiCDIApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DemoRestApiCDIApplication.class, args);
        SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDAO());

    }

}
