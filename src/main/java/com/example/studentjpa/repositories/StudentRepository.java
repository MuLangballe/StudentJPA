package com.example.studentjpa.repositories;

import com.example.studentjpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

        List<Student> findAllByName(String name);
}
