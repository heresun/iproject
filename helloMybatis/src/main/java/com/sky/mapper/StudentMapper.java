package com.sky.mapper;

import com.sky.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> getStudentList(Student student);
}
