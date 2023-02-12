package com.example.demo.service;

import com.example.demo.model.sql.TbStudent;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public List<TbStudent> getAllStudents() {
        var students = studentRepository.findAll();
        students.forEach(tbStudent -> System.out.println(tbStudent.getFirstname()));
        return students;
    }
    private TbStudent samane = new TbStudent();
    @Transactional
    public void addStudent() {
        this.samane = samane;
        samane.setId(1272L);
        samane.setFirstname("samane");
        samane.setLastname("joon");
        samane.setStuAge((short) 12);
        studentRepository.insertstudent(samane);
    }

    //please add update and insert and delete methods
}
