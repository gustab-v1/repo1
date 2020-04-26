package com.itheima.Controller;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/findAll")
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
