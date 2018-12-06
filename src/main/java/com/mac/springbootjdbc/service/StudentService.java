package com.mac.springbootjdbc.service;

import com.mac.springbootjdbc.mapper.StudentMapper;
import com.mac.springbootjdbc.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectStudentAll() {
        return studentMapper.selectStudentAll();
    }
}
