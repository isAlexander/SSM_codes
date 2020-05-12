package com.impl;

import com.UserDao;
import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverLocalFilesystem;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
     public void say() {
         System.out.println("UserDao say hello world !");

     }
}
