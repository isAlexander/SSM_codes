package com.ch03.CgLib;

import com.ch03.MyAspect;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    public Object createProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback((Callback) this);
        return enhancer.create();
    }

    public Object intercept (Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable{
        MyAspect myAspect = new MyAspect();
        MyAspect.checkPermission();
        Object object = methodProxy.invokeSuper(proxy, args);
        myAspect.log();
        return object;
    }

//    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
//        return null;
//    }
}
