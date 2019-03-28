package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

/**
 * Created by miaojie on 2019/3/19.
 */
public interface StudentService {

    /**
     * 查找全部
     * @return List<Student>
     */
    List<Student> findAll();


    /**
     * 保存
     * @param student 学生实体类
     * @return 学生
     */
    Student save(Student student);

    /**
     * 删除
     *
     * @param student 学生
     * @return boolean
     */
    boolean delOne(Student student);

    /**
     * 动态构建sql 模糊查询
     * @param stuNum 学号
     * @return 学生list
     */
    List<Student> findBySpeci(String stuNum);

}
