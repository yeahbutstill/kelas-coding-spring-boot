package com.yeahbutstill.demorestapi;

import com.yeahbutstill.demorestapi.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoRestApiXMLContextApplication {

    // What are the beans? @Component
    // What are the dependencies of a bean? @Autowired
    // What to search for beans? => No need

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoRestApiXMLContextApplication.class);

    public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		BinarySearchImpl binarySearch1 = new BinarySearchImpl(new QuickSortAlgorithm());

        // Application Context
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
            LOGGER.info("{} {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());

        }

    }

}
