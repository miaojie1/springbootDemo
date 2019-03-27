package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Student dao层
 * Created by miaojie on 2019/3/19.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findByStuNum(String stuNum);

    List<Student> findByStuNumLike(String stuNum);
}
