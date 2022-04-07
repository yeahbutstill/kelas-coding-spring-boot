package com.yeahbutstill.demorestapi;

import com.yeahbutstill.componentscan.ComponentDAO;
import com.yeahbutstill.demorestapi.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.yeahbutstill.componentscan")
public class DemoRestApiComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoRestApiComponentScanApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DemoRestApiComponentScanApplication.class, args);
        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);;

    }

}
