package com.mac.springbootjdbc.controller;

import com.mac.springbootjdbc.model.student.Student;
import com.mac.springbootjdbc.service.StudentService;
import com.mac.springbootjdbc.util.MsgResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("school/students")
public class StudentController {

    public StudentController() {
        System.out.println("into controller");
    }

    @Autowired
    private StudentService studentService;

    /**
     * 查询所有学生信息
     * @return
     */
    @GetMapping("student")
    public MsgResponse selectStudentAll() {
        MsgResponse response = new MsgResponse();
        Map<String, Object> map = new HashMap<>();

        List<Student> students = studentService.selectStudentAll();
        map.put("students", students);
        response.setData(map);

        return response;
    }

}
