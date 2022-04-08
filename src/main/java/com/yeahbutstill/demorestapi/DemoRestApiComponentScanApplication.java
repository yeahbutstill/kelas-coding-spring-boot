package com.yeahbutstill.demorestapi;

import com.yeahbutstill.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yeahbutstill.componentscan")
public class DemoRestApiComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoRestApiComponentScanApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoRestApiComponentScanApplication.class)) {
            ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

            LOGGER.info("{}", componentDAO);
        }

    }

}
