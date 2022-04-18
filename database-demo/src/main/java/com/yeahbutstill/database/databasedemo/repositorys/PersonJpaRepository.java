package com.yeahbutstill.database.databasedemo.repositorys;

import com.yeahbutstill.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

// Repository ini untuk menandatak bahwa ini adalah repository
@Repository
/**
 * jadi kapan pun kita memasukan bari dan menghapus bari dan setiap kali melakukan pembaruan ke database, Transaction
 * menjadi sangat penting. Ketika Anda melakukan tiga atau empat langkah pembaruan dalam satu
 * Transaction. anda ingin semuanya berhasil atau semuanya gagal bersama.
 * Transaction bisa ditaro di bisnis logic a.k.a service
 */

@Transactional
public class PersonJpaRepository {

    // Connected to the database
    // semua operasi tidak benar-benar disimpan dalam EntityManager
    @PersistenceContext
    /**
     * mengola entitas, semua operasi yang anda lakukan dalam sesi tertentu semua disimpan di dalam Entity Manager anda
     * EntityManager adalah interface ke PesistanceContext, semua operasi harus melalui EntityManager
     */
    EntityManager entityManager;

    public Person findById(int id) {
        /**
         * ada sejumlah methode pencarian di dalam EntityManager
         * yang akan digunakan adalah, entity apa? apa primary key nya
         */
        return entityManager.find(Person.class, id); //JPA
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public void deleteById(int id) {
        Person person = findById(id);
        entityManager.remove(person);
    }
}
