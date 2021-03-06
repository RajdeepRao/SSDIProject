package com.tara.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tara.entity.Score;

@Repository

public interface ScoreDAO extends JpaRepository<Score, Integer>{
	
	Score findByninerId(int ninerId);

	
    @Transactional
    void deleteByninerId(int ninerId);
}
