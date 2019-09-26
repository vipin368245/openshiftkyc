package com.boa.kycprocess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.kycprocess.models.Customer;
import com.boa.kycprocess.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	//insert 
	
	public Customer addCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}
	
	//select all
	public List<Customer> getAllCustomers()
	{
		return customerRepository.findAll();
	}
	
	//select by id
	
	public Customer getCustomerById(long id)
	{
		return customerRepository.findById(id).orElse(null);
	}
	
	
	
}
