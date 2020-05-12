package com.impl;

import com.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

//@Controller("userController")
public class UserController {

//    @Resource(name = "userService")
    private UserService userService;

    public void say(){
        System.out.println("UserController say hello world !");
        this.userService.say();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
