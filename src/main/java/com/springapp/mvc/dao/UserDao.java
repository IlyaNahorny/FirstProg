package com.springapp.mvc.dao;

import com.springapp.mvc.models.User;

import java.util.List;

/**
 * Created by dulik on 14.04.2016.
 */
public interface UserDao {
    void insert(User user);
    //public List<User> getAllUsers();
}
