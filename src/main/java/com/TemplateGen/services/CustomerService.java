package com.TemplateGen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.TemplateGen.entities.Customer;
import com.TemplateGen.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
    private JdbcTemplate jtm;

    public List<Customer> findAll() {

        String sql = "SELECT * FROM CUSTOMERS";

        List<Customer> cars = jtm.query(sql, new BeanPropertyRowMapper(Customer.class));

        return cars;
    }
}
