package com.yeahbutstill.database.databasedemo.springdata;

import com.yeahbutstill.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// entity apa yang ingin kita kelola dengan ini? Person dan apa primary key nya Integer
public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
