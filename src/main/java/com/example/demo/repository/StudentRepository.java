package com.example.demo.repository;

import com.example.demo.model.sql.TbStudent;
import com.querydsl.core.types.QBean;
import com.querydsl.sql.RelationalPath;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.dml.SQLInsertClause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.demo.model.sql.QStudent.student;
import static com.querydsl.core.types.Projections.bean;


@Repository
public class StudentRepository {

    private static final QBean<TbStudent> qTbStudent = bean(TbStudent.class, student.all());


    @Autowired
    private SQLQueryFactory sqlQueryFactory;

    public List<TbStudent> findAll() {
        return sqlQueryFactory.select(qTbStudent).from(student).fetch();
    }
    public void insertstudent(TbStudent student1) {
        sqlQueryFactory.insert(student).populate(student1).execute();
    }
}
