package com.springapp.mvc.dao;

import com.springapp.mvc.models.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by dulik on 14.04.2016.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }
}
