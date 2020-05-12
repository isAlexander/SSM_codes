package com.ch07.mappers;

import com.ch07.Customer;
import com.ch07.Press;
import com.ch07.Press;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {

    List<Customer> findCustomerByNameAndJobs(Customer customer);

    List<Customer> findCustomerByNameOrJobs(Customer customer);

    int updateCustomer(Customer customer);

    int findCustomerByIds(Press press);
}
