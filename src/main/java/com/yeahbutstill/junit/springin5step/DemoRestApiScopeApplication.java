package com.yeahbutstill.junit.springin5step;

import com.yeahbutstill.junit.springin5step.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoRestApiScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoRestApiScopeApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoRestApiScopeApplication.class)) {
            PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
            PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

            LOGGER.info("{}", personDAO);
            LOGGER.info("{}", personDAO.getJdbcConnection());

            LOGGER.info("{}", personDAO1);
            LOGGER.info("{}", personDAO1.getJdbcConnection());
        }

    }

}
