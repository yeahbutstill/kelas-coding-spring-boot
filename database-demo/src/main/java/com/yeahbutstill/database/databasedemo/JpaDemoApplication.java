package com.yeahbutstill.database.databasedemo;

import com.yeahbutstill.database.databasedemo.entity.Person;
import com.yeahbutstill.database.databasedemo.jdbc.PersonJdbcDao;
import com.yeahbutstill.database.databasedemo.repositorys.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

/**
 * Jadi ketika konteks aplikasi ini meluncurkan kode di CommandLineRunner dijalankan.
 */

@SpringBootApplication
// ini akan diluncurkan ketika saya mengimplementasikan CommandLineRunner
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	// dan kemudian kode ini yang kami tulis dalam methode spesifik yang akan diluncurkan
	@Override
	public void run(String... args) throws Exception {

		logger.info("Users id 1001 -> {}", repository.findById(2));

		// hibernate akan langsung menetapkan id berdasarkan urutan yang dibuatnya. Sequences HIBERNATE_SEQUENCE
		logger.info("Inserting -> {}", repository.insert(new Person("Uul",
				"Jakarta, Indonesia", new Date())));
		logger.info("Inserting -> {}", repository.insert(new Person("Yuni",
				"Citayam, Indonesia", new Date())));
		logger.info("Inserting -> {}", repository.insert(new Person("Maya",
				"Depok, Indonesia", new Date())));
		logger.info("Inserting -> {}", repository.insert(new Person("Winda",
				"Citayam, Indonesia", new Date())));

		logger.info("Update 1003  -> {}", repository.update(new Person(1003, "Sehu",
				"Citayam, Indonesia", new Date())));

		repository.deleteById(1);

		logger.info("All Users -> {}", repository.findAll());

	}
}
