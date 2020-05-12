package com.ch03.Test;

import com.ch03.SpringInterceptor;
import com.ch03.UserDao;
import com.ch03.UserDaoImpl;
import org.springframework.aop.framework.ProxyFactoryBean;

public class SpringAOPTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//        UserDao userDao = new UserDaoImpl();
//        proxyFactoryBean.setTarget(userDao);
//        proxyFactoryBean.setInterfaces(userDao.getClass().getInterfaces());
//        SpringInterceptor springInterceptor = new SpringInterceptor();
//        String string = "springInterceptor";
//        proxyFactoryBean.setInterceptorNames(string);
//
//        UserDao proxy = (UserDao) proxyFactoryBean;

//        UserDao userDao = (UserDao) context.getBean("proxy");
//        proxy.addUser();

        UserDao userDao=new UserDaoImpl();
        SpringInterceptor springInterceptor=new SpringInterceptor();


        ProxyFactoryBean proxyFactoryBean=new ProxyFactoryBean();
        proxyFactoryBean.setInterfaces(userDao.getClass().getInterfaces());
        proxyFactoryBean.setTarget(userDao);
        proxyFactoryBean.setInterceptorNames(springInterceptor.getClass().getCanonicalName());
        UserDao proxy=(UserDao)proxyFactoryBean;

        proxy.addUser();
    }
}
