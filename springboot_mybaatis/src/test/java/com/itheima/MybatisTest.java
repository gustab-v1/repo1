package com.itheima;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisTest {
    @Autowired
    CustomerService customerService;

    @Test
    public void test01(){
        List<Customer> customers = customerService.findAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
