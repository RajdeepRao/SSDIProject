package com.tara.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tara.entity.TestTakers;

@Repository

public interface TestTakersDAO extends JpaRepository<TestTakers, Integer>{
	
	TestTakers findById(int Id);

	
    @Transactional
    void deleteByid(int id);
}
