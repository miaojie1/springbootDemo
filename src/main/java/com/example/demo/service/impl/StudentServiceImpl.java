package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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

    @Override
    public List<Student> findBySpeci(String stuNum) {

        Specification<Student> specification = new Specification<Student>() {
            @Override
            public Predicate toPredicate(Root<Student> root,
                                         CriteriaQuery<?> query,
                                         CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if (!StringUtils.isEmpty(stuNum)) {
                    predicates.add(cb.like(root.get("stuNum").as(String.class), "%" + stuNum + "%"));
                }
                Predicate[] pre = new Predicate[predicates.size()];
                return query.where(predicates.toArray(pre)).getRestriction();
            }
        };
        List<Student> studentList = studentRepository.findAll(specification);

        return studentList;
    }
}
