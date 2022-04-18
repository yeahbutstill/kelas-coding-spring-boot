package com.yeahbutstill.database.databasedemo.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
public class Person {

    // primary key
    @Id
    /**
     * Saya tidak ingin mengatur id secara manual. Kapan pun saya butuhkan, masukan baris baru yang saya inginkan
     * Hibernate untuk dapat membuat id untuk saya.
     */
    @GeneratedValue
    private Integer id;

    private String name;
    private String location;
    private Date birthDate;

    public Person() {
    }

    public Person(Integer id, String name, String location, Date birthDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    // tidak menambahkan id karena hibernate akan memberikan nilai untuk itu
    public Person(String name, String location, Date birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(location, person.location) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

}
