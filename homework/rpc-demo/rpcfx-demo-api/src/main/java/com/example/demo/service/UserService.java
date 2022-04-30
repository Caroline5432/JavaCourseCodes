package com.example.demo.service;

import com.example.demo.model.User;

/**
 * @author caroline
 */
public interface UserService {

    /**
     * find by id
     * @param id id
     * @return user
     */
    User findById(Integer id);
}
