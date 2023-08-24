package com.springboot_with_postgres.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //method for create table
    public void createTable() {

        var query = "create table student(id serial primary key, name varchar(200) not null, age varchar(3))";

        this.jdbcTemplate.update(query);

        System.out.println("Table created..!");
    }

    //method for insert data into table
    public void insertData(String name, String age) {

        var query = "insert into student(name, age) values(?, ?)";

        this.jdbcTemplate.update(query, name, age);

        System.out.println("Data inserted into table..!");
    }
}
