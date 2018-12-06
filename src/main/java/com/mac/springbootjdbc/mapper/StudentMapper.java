package com.mac.springbootjdbc.mapper;

import com.mac.springbootjdbc.model.student.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper {

    /**
     * 查询所有学生
     * @return
     */
    List<Student> selectStudentAll();
}