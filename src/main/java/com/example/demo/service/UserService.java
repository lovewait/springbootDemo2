package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<UserEntity> getAllUserList(){
        return userDao.getAll();
    }
}
