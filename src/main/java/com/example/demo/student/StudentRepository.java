package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//For database layer
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);
}
