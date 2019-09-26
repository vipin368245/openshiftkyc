package com.boa.kycprocess.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boa.kycprocess.models.Customer;
import com.boa.kycprocess.services.CustomerService;

@RestController
public class CustomerController {
	
	  @Autowired private CustomerService customerService;
	  
	  @CrossOrigin("*")//cors issue
	  
	  @PostMapping("/addcustomer") public @ResponseBody Customer
	  saveCustomer(@RequestBody Customer customer) { return
	  customerService.addCustomer(customer); }
	  
	  @CrossOrigin("*")
	  
	  @GetMapping("/getcustomers") public List<Customer> findAllCustomers() {
	  return customerService.getAllCustomers(); }
	  
	  @CrossOrigin("*")
	  
	  @GetMapping("/getcustomerbyid/{id}") public Customer
	  findCustomerById(@PathVariable("id") long id ) { return
	  customerService.getCustomerById(id); }
	 
    
    
	
	
}
