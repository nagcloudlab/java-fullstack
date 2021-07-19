package com.example;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeID implements Serializable{
	

	int empId;
	int depId;
	
	
	

}
