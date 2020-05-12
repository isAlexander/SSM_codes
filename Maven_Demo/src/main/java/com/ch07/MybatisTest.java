package com.ch07;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisTest {


    @Test
    public void addCustomerTest(){
        // 获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("rose55");
        customer.setJobs("student");
        customer.setPhone("13333533092");
        int rows = sqlSession.insert("com.ch07.mappers."
                + "CustomerMapper.insertCustomer", customer);
        // 输出插入数据的主键id值
        System.out.println(customer.getId());
        if(rows > 0){
            System.out.println("您成功插入了"+rows+"条数据！");
        }else{
            System.out.println("执行插入操作失败！！！");
        }
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void findAllUserTest() {
        SqlSession sqlSession = MybatisUtils.getSession();
        List<User> list = sqlSession.selectList("com.ch07.mappers.UserMapper.findAllUser");
        for (User user : list) {
            System.out.println(user);
        }
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void findAllCustomerTest() {
        // 获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("rose55");
        customer.setJobs("student");
        List<Customer> customers=sqlSession.selectList("com.ch07.mappers.CustomerMapper.findCustomerByNameAndJobs",customer);
        for(Customer customer1:customers){
            System.out.println(customer1);
        }
        sqlSession.close();
    }



    @Test
    public void findAllTest() {
        // 获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        Press press=new Press();
        press.ids=ids;
//        Map<String,List<Integer>> map=new HashMap<String, List<Integer>>();
//        map.put("ids",ids);
        List<Customer> customers=sqlSession.selectList("com.ch07.mappers.CustomerMapper.findCustomerByIds",press);
        for(Customer customer1:customers){
            System.out.println(customer1);
        }
        sqlSession.close();
    }


    @Test
    public void updateCustomerTest() {
        // 获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setUsername("rose55");
//        customer.setJobs("student");
//        customer.setPhone("13333533092");
        List<Customer> customers=sqlSession.selectList("com.ch07.mappers.CustomerMapper.updateCustomer",customer);
        for(Customer customer1:customers){
            System.out.println(customer1);
        }
        sqlSession.close();
    }
}
