package com.example.lab15.controller;

import com.example.lab15.domain.Student;
import com.example.lab15.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> findAll(){
        return studentService.findAll();
    }
}
