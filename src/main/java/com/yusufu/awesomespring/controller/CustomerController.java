package com.yusufu.awesomespring.controller;

import com.yusufu.awesomespring.entity.Customer;
import com.yusufu.awesomespring.entity.Item;
import com.yusufu.awesomespring.repo.CustomerRepository;
import com.yusufu.awesomespring.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value = "/add")
    public void add(){
        Customer customer = new Customer();
        customerRepository.save(customer);

    }


}
