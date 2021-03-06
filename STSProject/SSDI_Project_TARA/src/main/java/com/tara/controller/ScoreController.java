package com.tara.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tara.entity.Score;
import com.tara.service.ScoreService;

@RestController
@RequestMapping("/score")

public class ScoreController {
	
	@Autowired
	private ScoreService scoreservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Score> findAll(){
		 return scoreservice.findAll();
	 }
	
	@RequestMapping(value="/{Id}", method = RequestMethod.GET)
	public Score findById(@PathVariable("Id") int Id){
		 return scoreservice.findById(Id);
	 }
	
	@RequestMapping(method = RequestMethod.PUT)
	public void createScore(@RequestBody Score score){
		scoreservice.createScore(score);
	 }
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteTestByID(@PathVariable("id") int id){
		this.scoreservice.deleteScoreByID(id);
	 }
	
	/*@RequestMapping(method = RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student){
		this.studentservice.updateStudent(student);
	 }
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student){
		this.studentservice.insertStudent(student);
	}*/
	
}
