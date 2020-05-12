package com.ch03.Test;

import com.ch03.CglibProxy;
import com.ch03.UserDao2;
import org.springframework.cglib.proxy.Enhancer;

public class Test2 {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao2 userDao2 = new UserDao2();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userDao2.getClass());
        enhancer.setCallback(cglibProxy);
        UserDao2 proxy = (UserDao2) enhancer.create();
        proxy.addUser();
        System.out.println("-----------------------");
        proxy.deleteUser();
    }
}
