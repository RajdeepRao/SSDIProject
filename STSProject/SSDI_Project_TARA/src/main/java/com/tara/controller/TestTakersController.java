package com.tara.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tara.entity.TestTakers;
import com.tara.service.TestTakersService;

@RestController
@RequestMapping("/testtakers")

public class TestTakersController {
	
	@Autowired
	private TestTakersService testtakersservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<TestTakers> findAll(){
		 return testtakersservice.findAll();
	 }
	
	@RequestMapping(value="/{Id}", method = RequestMethod.GET)
	public TestTakers findById(@PathVariable("Id") int Id){
		 return testtakersservice.findById(Id);
	 }
	
	@RequestMapping(method = RequestMethod.PUT)
	public void createApplication(@RequestBody TestTakers testtakers){
		testtakersservice.createTest(testtakers);
	 }
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteTestByID(@PathVariable("id") int id){
		this.testtakersservice.deleteTestTakersByID(id);
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
