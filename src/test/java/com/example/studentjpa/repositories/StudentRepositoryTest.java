package com.example.studentjpa.repositories;

import com.example.studentjpa.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testAtLeastOneBruce(){
        List<Student> std = studentRepository.findAllByName("Bruce");
       // assertEquals(1, std.size());
        assertTrue(std.size()>0);
    }

    @Test
    void testOneBruce(){
        List<Student> std = studentRepository.findAllByName("Bruce");
        assertEquals(1, std.size());
    }
}