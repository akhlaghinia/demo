package com.example.demo.web;

import com.example.demo.model.sql.TbStudent;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<TbStudent> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public void addStudent() {
        studentService.addStudent();
    }
}

