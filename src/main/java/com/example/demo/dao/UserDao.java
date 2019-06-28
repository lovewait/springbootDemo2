package com.example.demo.dao;

import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    List<UserEntity> getAll();
}
