package com.yeahbutstill.database.databasedemo.jdbc;

import com.yeahbutstill.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {

    /**
     * Jika anda menggunakan Spring maka anda harus menggunakan template JDBC
     * untuk menjalankan query.
     */
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    // select * from person
    // dan dimana saya ingin mapping? entity person
    public List<Person> findAll() {
        // Sekarang saya perlu memetakan data apa pun yang datang dari sini ke bean person saat kueri dieksekusi
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
    }
    
}
