package com.ch03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler {
    private UserDao userDao;
    public JDKProxy (UserDao userDao){
        this.userDao = userDao;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect.checkPermission();
        Object object = method.invoke(userDao,args);
        MyAspect.log();
        return object;
    }
}
