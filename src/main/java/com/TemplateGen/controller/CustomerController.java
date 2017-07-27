package com.TemplateGen.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.TemplateGen.entities.Customer;
import com.TemplateGen.services.CustomerService;
import com.TemplateGen.services.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
    private ICustomerService customerService;
    
    @RequestMapping("/")
    public String index(Model model) {
        
        return "index";
    }    

    @RequestMapping("/showCustomers")
    public ModelAndView showCars() {

        List<Customer> customers = customerService.findAll();

        Map<String, Object> params = new HashMap<>();
        params.put("customers", customers);

        return new ModelAndView("showCustomers", params);
    }
}

