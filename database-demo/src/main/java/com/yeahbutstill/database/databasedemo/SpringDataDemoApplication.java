package com.yeahbutstill.database.databasedemo;

import com.yeahbutstill.database.databasedemo.entity.Person;
import com.yeahbutstill.database.databasedemo.jdbc.PersonJdbcDao;
import com.yeahbutstill.database.databasedemo.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Users id 2 -> {}", repository.findById(2));

		logger.info("Inserting -> {}", repository.save(new Person("Uul",
				"Jakarta, Indonesia", new Date())));
		logger.info("Inserting -> {}", repository.save(new Person("Yuni",
				"Citayam, Indonesia", new Date())));
		logger.info("Inserting -> {}", repository.save(new Person("Maya",
				"Depok, Indonesia", new Date())));
		logger.info("Inserting -> {}", repository.save(new Person("Winda",
				"Citayam, Indonesia", new Date())));

		logger.info("Update 5  -> {}", repository.save(new Person(5, "Sehu",
				"Citayam, Indonesia", new Date())));

		repository.deleteById(1);

		logger.info("All Users -> {}", repository.findAll());

	}

}
