package com.boa.kycprocess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boa.kycprocess.models.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
