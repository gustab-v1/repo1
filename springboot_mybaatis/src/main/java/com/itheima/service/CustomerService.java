package com.itheima.service;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    public CustomerDao customerDao;
    public List<Customer> findAll(){
        return customerDao.findAll();
    }
}
