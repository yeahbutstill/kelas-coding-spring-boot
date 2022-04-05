package com.yeahbutstill.demorestapi;

import com.yeahbutstill.demorestapi.services.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoRestApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoRestApiApplication.class, args);

		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[]{12,4,6}, 3);
		System.out.println(result);

	}

}
