package com.itheima.dao;

import com.itheima.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerDao {
    @Select("select * from cst_customer")
    List<Customer> findAll();
}
