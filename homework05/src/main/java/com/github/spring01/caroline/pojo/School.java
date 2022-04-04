package com.github.spring01.caroline.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @ClassName School
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 13:33
 **/
@Data
public class School {

    @Autowired(required = true)
    Klass class1;

    @Resource(name = "student111")
    Student student111;

    public void ding(){

        System.out.println("Class1 have " + this.class1.getStudents().size() + " students and one is " + this.student111);

    }

}
