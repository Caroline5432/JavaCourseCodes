package com.github.spring01.caroline.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName StudentDaoImpl
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 13:16
 **/
//@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{


    @Override
    public void save() {
        System.out.println("save student ...");
    }
}
