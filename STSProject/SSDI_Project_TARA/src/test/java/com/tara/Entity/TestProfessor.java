package com.tara.Entity;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tara.SsdiProjectTaraApplication;
import com.tara.entity.Professor;
import com.tara.service.ProfessorService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SsdiProjectTaraApplication.class)
public class TestProfessor {
	
	private Professor professor;
	
	@Autowired
	private ProfessorService professorService;

	@Before
	public void setUp() throws Exception {
		professor = new Professor();
		professor.setFirstName("ProfTestFname");
		professor.setLastName("ProfTestLname");
		professor.setEmailId("testemail@abc.com");
		
		professor.setninerId(82);
		professor.setPassword("testpassword");
		
	}
	
	
	
	@Test
	public void testSetninerId() {
    	boolean exceptionCaught = false;
    	try{
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    	exceptionCaught = false;
    	try{
    		professor.setninerId(null);
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertTrue(exceptionCaught);
    	
	}

	@Test
	public void testGetninerId() {
		boolean exceptionCaught = true;
    	try{
    		professor.setninerId(99);
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = false;
    	}
    	assertTrue(exceptionCaught && professor.getninerId() == 99);
		
	}

	

	@Test
	public void testGetEmailId() {
		boolean exceptionCaught = true;
    	try{
    		professor.setEmailId("TestingEmail@abc.com");
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = false;
    	}
    	assertTrue(exceptionCaught && professor.getEmailId() == "TestingEmail@abc.com");
		
	}
	
	@Test
	public void testSetEmailId() {
		
		boolean exceptionCaught = false;
    	try{
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    	exceptionCaught = false;
    	try{
    		professor.setEmailId(null);
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertTrue(exceptionCaught);
    	
	}

	@Test
	public void testGetFirstName() {
		boolean exceptionCaught = true;
    	try{
    		professor.setFirstName("TestFName");
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = false;
    	}
    	assertTrue(exceptionCaught && professor.getFirstName() == "TestFName");
		
	}

	@Test
	public void testSetFirstName() {
		boolean exceptionCaught = false;
    	try{
    		professor.setFirstName("TestFName");
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    	exceptionCaught = false;
    	try{
    		professor.setFirstName(null);
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertTrue(exceptionCaught);
    	
	}
	
	@Test
	public void testGetLastName() {
		boolean exceptionCaught = true;
    	try{
    		professor.setLastName("TestLName");
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = false;
    	}
    	assertTrue(exceptionCaught && professor.getLastName() == "TestLName");
		
	}

	@Test
	public void testSetLastName() {
		boolean exceptionCaught = false;
    	try{
    		professor.setLastName("TestLName");
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    	exceptionCaught = false;
    	try{
    		professor.setLastName(null);
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertTrue(exceptionCaught);
	}
	
	@Test
	public void testGetPassword() {
		boolean exceptionCaught = true;
    	try{
    		professor.setPassword("TestPass");
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = false;
    	}
    	assertTrue(exceptionCaught && professor.getPassword() == "TestPass");
	}

	@Test
	public void testSetPassword() {
		boolean exceptionCaught = false;
    	try{
    		professor.setPassword("TestPass");
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    	exceptionCaught = false;
    	try{
    		professor.setPassword(null);
    		professorService.createProfessor(professor);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertTrue(exceptionCaught);
	}

}
