package com.ch03.aspect;


import com.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao=(UserDao) context.getBean("userDao");

        userDao.say();
    }
}

