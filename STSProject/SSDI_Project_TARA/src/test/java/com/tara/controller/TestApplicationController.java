package com.tara.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestApplicationController {

	 
	@Autowired
    private WebApplicationContext webApplicationContext;

    /*private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .build();
    }
    @Test
	public void testfindById() throws Exception {
    	 mockMvc.perform(get("/applications/1"))
         .andExpect(status().isOk())
         .andExpect(
                 content().contentType(MediaType.APPLICATION_JSON_VALUE))
         .andExpect(jsonPath("$.firstName").value("Rajdeep"));
    }*/
  
    
}