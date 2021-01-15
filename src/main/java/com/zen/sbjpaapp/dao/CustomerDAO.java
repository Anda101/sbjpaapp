package com.zen.sbjpaapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zen.sbjpaapp.domain.Customer;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer>{
	
	public List<Customer> findAll();
	public Customer findById(int id);
	public Customer findByName(String name);
	public Customer findByEmail(String email);
	//implement List findByName and Customer findByEmail;
	
	

}
