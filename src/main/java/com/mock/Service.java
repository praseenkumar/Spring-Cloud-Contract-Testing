package com.mock;

import org.springframework.stereotype.Component;

@Component
public class Service {
	
	private EmpData empdata = new EmpData();
	
	public EmpData returnsData() {
	
	empdata.setEmployeeId("50001289");
	empdata.setName("Mr. Sunil Suryabhanrao Borade");
	empdata.setDateofBirth("278899200");
	empdata.setWorkLocation("Pune Off.");
	empdata.setBand("D2");
	empdata.setDesination("General Manager");
	empdata.setRelianceEmail("SUNIL.BORADE@RIL.COM");
	empdata.setMobileNo("9890512221");
	empdata.setResidenceNo("020-25438017");
	empdata.setPosFromTop(5);
	empdata.setManagerId("10010301");
	empdata.setManagerName("Dr. Vineet Malaviya");
	
    return empdata;
	
	}
	
	
	
	
	
	
	

}
