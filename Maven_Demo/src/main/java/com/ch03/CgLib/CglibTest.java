package com.ch03.CgLib;

public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibproxy = new CglibProxy();
        UserDao userDao = new UserDao();
        UserDao userDao1 = (UserDao) cglibproxy.createProxy (userDao);
        userDao1.addUser();
        System.out.println("----------------------------");
        userDao1.deleteUser();
    }
}
