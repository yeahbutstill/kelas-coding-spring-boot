package com.yeahbutstill.database.databasedemo.jdbc;

import com.yeahbutstill.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {

    /**
     * Jika anda menggunakan Spring maka anda harus menggunakan template JDBC
     * untuk menjalankan query.
     */
    @Autowired
    JdbcTemplate jdbcTemplate;

    // Custom spring JDBC RowMapper
    class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirthDate(rs.getTimestamp("birth_date"));
            return person;
        }
    }
    
    // select * from person
    // dan dimana saya ingin mapping? entity person
    public List<Person> findAll() {
        // Sekarang saya perlu memetakan data apa pun yang datang dari sini ke bean person saat kueri dieksekusi
//        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));

        // Use custom spring JDBC RowMapper
        return jdbcTemplate.query("select * from person", new PersonRowMapper());
    }

    public Person findById(Integer id) {
        // Anda dapat menggunakan ketika anda benar-benar mencari object
        return (Person) jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id},
                new BeanPropertyRowMapper(Person.class));
    }

    public int deleteById(Integer id) {
        return jdbcTemplate.update("delete from person where id=?", new Object[]{id});
    }

    public int insert(Person person) {
        return jdbcTemplate.update(
                "insert into person(id, name, location, birth_date) "
                        + "values(?, ?, ?, ?)",
                new Object[]{
                        person.getId(), person.getName(),
                        person.getLocation(), new Timestamp(person.getBirthDate().getTime())
                });
    }

    public int update(Person person) {
        return jdbcTemplate.update("update person set name = ?, location = ?, birth_date = ?" +
                "where id = ?", new Object[]{person.getName(),
                person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId()});
    }

}
