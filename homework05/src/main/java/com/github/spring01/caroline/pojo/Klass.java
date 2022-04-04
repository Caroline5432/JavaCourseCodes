package com.github.spring01.caroline.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Klass
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 13:32
 **/

@Data
public class Klass {

    List<Student> students;

    public void dong(){
        System.out.println(this.getStudents());
    }

}
