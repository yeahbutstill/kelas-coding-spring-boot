package com.yeahbutstill.demorestapi;

import com.yeahbutstill.demorestapi.services.impl.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoRestApiApplication {

    // What are the beans? @Component
    // What are the dependencies of a bean? @Autowired
    // What to search for beans? => No need

    public static void main(String[] args) {

//		BinarySearchImpl binarySearch1 = new BinarySearchImpl(new BubbleSortAlgorithm());
//		BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgorithm());

        // Application Context
        ApplicationContext applicationContext = SpringApplication.run(DemoRestApiApplication.class, args);
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
        int result1 = binarySearch1.binarySearch(new int[]{12, 4, 6, 8, 1, 2, 13, 14, 15, 16}, 10);

        System.out.println(result1);

    }

}
