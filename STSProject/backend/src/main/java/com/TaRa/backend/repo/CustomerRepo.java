package com.TaRa.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaRa.backend.domain.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
