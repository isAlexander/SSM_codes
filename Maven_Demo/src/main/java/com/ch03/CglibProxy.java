package com.ch03;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CglibProxy implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable{
        MyAspect myAspect = new MyAspect();
        MyAspect.checkPermission();
        Object object = methodProxy.invokeSuper(o,objects);
        MyAspect.log();
        return object;
    }

    public Object createProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

}
