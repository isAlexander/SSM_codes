package com.ch03.SpringAOP;

import com.ch03.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {
    public static void main(String[] args) {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
        userDao.addUser();
        userDao.deleteUser();
    }
}
