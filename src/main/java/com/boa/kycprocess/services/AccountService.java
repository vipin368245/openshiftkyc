package com.boa.kycprocess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.kycprocess.models.Account;
import com.boa.kycprocess.models.Customer;
import com.boa.kycprocess.repositories.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private CustomerService customerService;
    @Autowired
	private AccountRepository accountRepository;    
    private Customer customer;
    public Account addAccount(Account account,long customerId)
    {
    	customer=customerService.getCustomerById(customerId);
    	account.setCustomer(customer);
    	return accountRepository.save(account);    	
    }
    
    public List<Account> getAllAccounts()
    {
    	return accountRepository.findAll();
    }
    
    
    
    
}
