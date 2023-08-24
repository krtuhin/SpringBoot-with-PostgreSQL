package com.springboot_with_postgres;

import com.springboot_with_postgres.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithPostgresApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithPostgresApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        this.studentRepository.createTable();

        this.studentRepository.insertData("Tuhin", "25");
    }
}
