package com.TaRa.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.TaRa.backend.domain.Customer;
import com.TaRa.backend.repo.CustomerRepo;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
	CustomerRepo rp;
	
	@RequestMapping("/findall")
    @ResponseBody
	public List<Customer> findall(){
	return rp.findAll();
	}
	
	
	
}