package com.yeahbutstill.database.databasedemo;

import com.yeahbutstill.database.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Jadi ketika konteks aplikasi ini meluncurkan kode di CommandLineRunner dijalankan.
 */

@SpringBootApplication
// ini akan diluncurkan ketika saya mengimplementasikan CommandLineRunner
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	// dan kemudian kode ini yang kami tulis dalam methode spesifik yang akan diluncurkan
	@Override
	public void run(String... args) throws Exception {
		logger.info("All Users -> {}", personJdbcDao.findAll());
		logger.info("Users id 1001 -> {}", personJdbcDao.findById(1001));
		logger.info("Deleting Users id 1002 -> No of rows deleted - {}", personJdbcDao.deleteById(1002));
	}
}
