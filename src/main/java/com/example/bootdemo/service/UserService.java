package com.example.bootdemo.service;


import com.example.bootdemo.entity.User;
import com.example.bootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findByName(String name){
        return userMapper.findUserByName(name);
    }

    public List<User> listName(){
        return userMapper.listUser();
    }

    public User insertUser(User user){
        return userMapper.insertUser(user);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public int deleteUser(int id){
        return userMapper.deleteUser(id);
    }
}
