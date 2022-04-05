package com.yeahbutstill.demorestapi;

import com.yeahbutstill.demorestapi.services.impl.BinarySearchImpl;
import com.yeahbutstill.demorestapi.services.impl.BubbleSortAlgorithm;
import com.yeahbutstill.demorestapi.services.impl.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRestApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoRestApiApplication.class, args);

		BinarySearchImpl binarySearch1 = new BinarySearchImpl(new BubbleSortAlgorithm());
		BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgorithm());

		int result1 = binarySearch1.binarySearch(new int[]{12,4,6}, 3);
		int result2 = binarySearch2.binarySearch(new int[]{12,4,6}, 3);

		System.out.println(result1);
		System.out.println(result2);

	}

}
