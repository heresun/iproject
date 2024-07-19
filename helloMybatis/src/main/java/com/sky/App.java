package com.sky;

import com.sky.entity.Student;
import com.sky.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);

        SqlSession sqlSession = sessionFactory.openSession(true);


        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setAge(0);

        List<Student> studentList = studentMapper.getStudentList(student);

        System.out.println(studentList);


    }
}
