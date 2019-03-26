package com.example.demo.service.impl;

import com.example.demo.entity.Result;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.image.RescaleOp;
import java.util.List;

/**
 * 实现类
 * Created by miaojie on 2019/3/19.
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    /**
     * 以下所有操作均没有对数据进行校验
     */

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByStuNum(String stuNum) {
        return studentRepository.findByStuNum(stuNum);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean delOne(Student student) {
        try {
            studentRepository.delete(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
