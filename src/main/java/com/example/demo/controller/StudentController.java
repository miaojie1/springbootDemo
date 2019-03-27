package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生controller
 * Created by miaojie on 2019/3/19.
 */
@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/studentList")
    public Result getList() {

        List<Student> studentList = studentService.findAll();
        return new Result(200, "成功", studentList);
    }

    @GetMapping("/searchStudentList")
    public List<Student> searchStudents(@RequestParam(value = "stuNum") String stuNum) {
        List<Student> students = studentService.findByStuNumLike(stuNum);
        return students;
    }

    @GetMapping("/searchStudent")
    public List<Student> searchStudent(@RequestParam(value = "stuNum") String stuNum) {
        if (stuNum == "") {
            return studentService.findAll();
        }
        return studentService.findByStuNum(stuNum);
    }

    @PostMapping("/insertStudent")
    public Result save(@RequestBody Student student) {
        Student stuResult = studentService.save(student);
        if (stuResult != null) {
            return new Result();
        }
        return new Result(500, "保存失败");
    }

    @PostMapping("/deleteStudent")
    public Result delete(@RequestBody Student student){
        Boolean stuResult = studentService.delOne(student);
        if (stuResult){
            return new Result();
        }
        return new Result(500, "删除失败");
    }
}
