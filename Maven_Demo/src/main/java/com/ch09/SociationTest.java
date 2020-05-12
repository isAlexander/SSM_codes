package com.ch09;

import com.ch07.MybatisUtils;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SociationTest {


    @Test
    public void findPersonByIdTest() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
        Person person = session.selectOne("com.ch09."
                + "PersonMapper.findPersonById", 1);
        // 3、输出查询结果信息
        System.out.println(person.getName());
        System.out.println(person.getCard());


        // 4、关闭SqlSession
        session.close();
    }

    /**
     * 一对多
     */
    @Test
    public void findUserTest() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        // 2、查询id为1的用户信息
        User user = session.selectOne("com.ch09.UserMapper.findUserWithOrdersById",1);
        // 3、输出查询结果信息
        System.out.println(user);

//        User user2 = session.selectOne("com.ch09.UserMapper.findUserWithOrders",1);
//        System.out.println(user2);
        // 4、关闭SqlSession
        session.close();
    }
}
