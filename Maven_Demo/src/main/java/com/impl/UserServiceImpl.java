package com.impl;

import com.UserDao;
import com.UserService;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Service("userService")
public class UserServiceImpl implements UserService , BeanNameAware {

//    @Resource(name = "userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void say() {
        System.out.println("UserService say hello world !");
        this.userDao.say();
    }

    public void setBeanName(String s) {
        System.out.println("I am : " + s );
    }
}
