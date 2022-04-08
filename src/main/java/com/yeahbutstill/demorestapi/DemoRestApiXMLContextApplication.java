package com.yeahbutstill.demorestapi;

import com.yeahbutstill.demorestapi.basic.BinarySearchImpl;
import com.yeahbutstill.demorestapi.xml.XMLPersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class DemoRestApiXMLContextApplication {

    // What are the beans? @Component
    // What are the dependencies of a bean? @Autowired
    // What to search for beans? => No need

    public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		BinarySearchImpl binarySearch1 = new BinarySearchImpl(new QuickSortAlgorithm());

        // Application Context
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
            System.out.println(xmlPersonDAO);
            System.out.println(xmlPersonDAO.getXmlJdbcConnection());

        }

    }

}
