package com.ch03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SpringInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        MyAspect.checkPermission();
        Object object = methodInvocation.proceed();
        MyAspect.log();

        return object;
    }
}
