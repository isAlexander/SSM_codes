package com.ch06;

import java.util.List;

public interface CustomerMapper {

    Customer findCustomerById(Integer id);


    List<Customer> findCustomerByName(String name);

    int addCustomer(Customer customer);

    int updateCustomer(Customer customer);

    int deleteCustomer(Integer id);



}
