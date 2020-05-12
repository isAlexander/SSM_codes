package com.ch03.SpringAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
//    @Override
    public Object invoke(MethodInvocation mi) throws Throwable{
        checkPermissions();
        Object object = mi.proceed();
        log();
        return object;

    }

    public void checkPermissions(){
        System.out.println("模拟检测权限........");
    }
    public void log(){
        System.out.println("模拟记录日志........");
    }

}
