package com.base;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mock.ConfluenceserviceApplication;
import com.mock.Controller;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConfluenceserviceApplication.class)

public class BaseClass {

	@Autowired
	private Controller controller;
	
	@Before
	public void setUp() {
		RestAssuredMockMvc.standaloneSetup(controller);
	 
}
}
