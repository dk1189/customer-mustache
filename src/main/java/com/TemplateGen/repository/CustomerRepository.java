package com.TemplateGen.repository;

import org.springframework.data.repository.CrudRepository;

import com.TemplateGen.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
