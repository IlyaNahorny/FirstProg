package com.springapp.mvc.service;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dulik on 12.04.2016.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> list = userDao.getAllUsers();
        return list;
    }
}
