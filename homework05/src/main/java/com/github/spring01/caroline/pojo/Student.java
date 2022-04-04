package com.github.spring01.caroline.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 12:29
 **/
@Data
public class Student implements Serializable {

    /**
     * 学号
     */
    private int id;

    /**
     * 姓名
     */
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
