package com.example.bootdemo.controller;


import com.example.bootdemo.entity.User;
import com.example.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @Autowired
    private UserService userService;

    @RequestMapping("/ListUser")
    public List<User> ListUser(){
        return userService.listName();
    }

    @RequestMapping("/ListUserByname")
    public List<User> ListUserByname(String name){
        return userService.findByName(name);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userService.deleteUser(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        int result = userService.updateUser(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user)
    {
        return userService.insertUser(user);
    }
}
