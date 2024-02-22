package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Johannes", 20,
                LocalDate.of(2002, Month.DECEMBER, 25),
                "johannes@gmail.com"));
    }
}
