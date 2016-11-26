package com.tara.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tara.entity.Test;
import com.tara.service.TestService;

@RestController
@RequestMapping("/test")

public class TestController {
	
	@Autowired
	private TestService testservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Test> findAll(){
		 return testservice.findAll();
	 }
	
	@RequestMapping(value="/{Id}", method = RequestMethod.GET)
	public Test findById(@PathVariable("Id") int Id){
		 return testservice.findById(Id);
	 }
	
	@RequestMapping(method = RequestMethod.PUT)
	public void createApplication(@RequestBody Test test){
		testservice.createTest(test);
	 }
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteTestByID(@PathVariable("id") int id){
		this.testservice.deleteTestByID(id);
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
