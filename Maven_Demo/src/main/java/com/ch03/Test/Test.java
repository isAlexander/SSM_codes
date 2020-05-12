package com.ch03.Test;

import com.ch03.JDKProxy;
import com.ch03.UserDao;
import com.ch03.UserDaoImpl;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args){
        UserDao userDao = new UserDaoImpl();
        JDKProxy jdkProxy = new JDKProxy(userDao);
        UserDao proxy = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),userDao.getClass().getInterfaces(),jdkProxy);
        proxy.addUser();
        System.out.println("--------------------------------");
        userDao.addUser();
    }
}
