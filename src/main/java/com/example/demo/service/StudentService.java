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
     * 通过学号查询
     * @param stuNum 学号
     * @return student
     */
    List<Student> findByStuNum(String stuNum);

    /**
     * 通过学号模糊查找
     * @param stuNum
     * @return
     */
    List<Student> findByStuNumLike(String stuNum);
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

}
