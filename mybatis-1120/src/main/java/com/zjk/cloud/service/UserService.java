package com.zjk.cloud.service;

import com.zjk.cloud.dao.UserDao;
import com.zjk.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int createUser(User user){
        return userDao.insertUser(user);
    }

    public User queryById(Long id){
        return userDao.queryById(id);
    }
}
