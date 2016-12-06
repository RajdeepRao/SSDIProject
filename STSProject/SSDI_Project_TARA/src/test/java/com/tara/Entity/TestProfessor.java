package com.tara.Entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.tara.SsdiProjectTaraApplication;
import com.tara.entity.Professor;
import com.tara.service.ProfessorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProfessor {
	
	private Professor professor;
	
	@Autowired
	private ProfessorService professorService;
	
	@Before
	public void setUp() throws Exception{
		professor = new Professor();
		professor.setFirstName("ProfTestFName");
		professor.setLastName("ProfTestLName");
		professor.setEmailId("prof@uni.com");
		professor.setninerId(99);
		professor.setPassword("pass");
	}

	@Test
	public void testGetId() {
		boolean exceptionCaught = false;
		try{
    		professorService.createProfessor(professor);
    		professor.getId();
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
		fail("GetId failed");
	}

	@Test
	public void testGetninerId() {
		professorService.createProfessor(professor);
    	
    	
    	assertFalse(professor.getninerId()==99);
		fail("GetninerId failed");
	}
/*
	@Test
	public void testSetninerId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmailId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEmailId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLastName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLastName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPassword() {
		fail("Not yet implemented");
	}
*/
}
