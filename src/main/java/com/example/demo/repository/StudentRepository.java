package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Student dao层
 * Created by miaojie on 2019/3/19.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Student findByStuNum(String stuNum);

}
