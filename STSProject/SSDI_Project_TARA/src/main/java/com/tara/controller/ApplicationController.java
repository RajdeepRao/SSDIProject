package com.tara.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tara.entity.Application;
import com.tara.service.ApplicationService;

@RestController
@RequestMapping("/applications")

public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Application> findAll(){
		 return applicationservice.findAll();
	 }
	
	@RequestMapping(value="/{Id}", method = RequestMethod.GET)
	public Application findById(@PathVariable("Id") int Id){
		 return applicationservice.findById(Id);
	 }
	
	@RequestMapping(method = RequestMethod.PUT)
	public void createApplication(@RequestBody Application application){
		applicationservice.createApplication(application);
	 }
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteApplicationByID(@PathVariable("id") int id){
		this.applicationservice.deleteApplicationByID(id);
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
