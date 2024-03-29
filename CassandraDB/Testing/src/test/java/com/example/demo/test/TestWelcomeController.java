package com.example.demo.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcRequestBuilders.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controllers.WelcomeController;

@RunWith(SpringRunner.class)
public class TestWelcomeController {
	
	private MockMvc mock;
	
	@InjectMocks
	private WelcomeController controller;
	
	@Before
	public void setup() throws Exception
	{
		this.mock=MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void testGetMessage() throws Exception
	{
		mock.perform(get("/greet")).andExpect(status().);
	}
	

}
