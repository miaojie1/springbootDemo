package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * student 实体类 采用驼峰命名  遇到大写对应数据库下滑线 例如：userName  ==> user_name
 * Created by miaojie on 2019/3/19.
 */
@Entity
@Table(name = "student")
@Data
public class Student implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String passWord;

    private String stuNum;

}
