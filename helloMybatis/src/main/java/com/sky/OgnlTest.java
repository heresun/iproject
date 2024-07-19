package com.sky;

import com.sky.entity.Student;
import org.apache.ibatis.ognl.Ognl;
import org.apache.ibatis.ognl.OgnlContext;
import org.apache.ibatis.ognl.OgnlException;

import java.util.HashMap;

public class OgnlTest {
    public static void main(String[] args) throws OgnlException {
//        Student student = new Student();
//        student.setName("nihao");
//
//        Student student1 = new Student();
//        student1.setName("Student1");
//
//        Student student2 = new Student();
//        student2.setName("Student2");
//
//        OgnlContext defaultContext = Ognl.createDefaultContext(student);
//        defaultContext.put("student1", student1);
//        defaultContext.put("student2", student2);
//
//        Object nihao = Ognl.getValue("#student2['name']", defaultContext, defaultContext.getRoot());
//        System.out.println(nihao);

        Student student = new Student();
        student.setAge(1);

        HashMap<String, Object> map = new HashMap<>();
        map.put("aa", student);

        OgnlContext defaultContext = Ognl.createDefaultContext(student);

        //
//        Object value1 = Ognl.getValue("age", defaultContext, student);
//        System.out.println(value1);

        Object value = Ognl.getValue("age != ''", defaultContext, student);

        System.out.println(value);


    }
}
