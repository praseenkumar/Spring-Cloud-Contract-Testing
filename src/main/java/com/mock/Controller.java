package com.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Service service;
	
	
	@GetMapping("/empData")
	public EmpData sendsEmpDetails(@RequestParam("id") int id) {
		
		if(id == 123) {
		EmpData empData = service.returnsData();
		return empData;
		}
		
		return null;
		
		
	}

}
