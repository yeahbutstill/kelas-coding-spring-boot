package com.yeahbutstill.springin5step;

import com.yeahbutstill.springin5step.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoRestApiBasicApplication {

    // What are the beans? @Component
    // What are the dependencies of a bean? @Autowired
    // What to search for beans? => No need

    public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		BinarySearchImpl binarySearch1 = new BinarySearchImpl(new QuickSortAlgorithm());

        // Application Context
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoRestApiBasicApplication.class)) {

            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
            BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

            System.out.println(binarySearch);
            System.out.println(binarySearch1);

            int result = binarySearch.binarySearch(new int[]{12, 4, 6, 8, 1, 2, 13, 14, 15, 16}, 10);
            System.out.println(result);

        }

    }

}
