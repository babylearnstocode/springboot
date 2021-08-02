package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args ->
        {
            Student tommy = new Student(

                    "Tommy",
                    LocalDate.of(1999, Month.APRIL, 22),
                    "tommydang@gmail.com"
            );

            Student smith = new Student(
                    "Smith",
                    LocalDate.of(2000, Month.JANUARY, 21),
                    "smithl@gmail.com"
            );

            studentRepository.saveAll(
                    List.of(tommy, smith)
            );
        };
    }
}
