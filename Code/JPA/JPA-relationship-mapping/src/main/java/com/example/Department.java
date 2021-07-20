package com.example;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	int id;
	String depName;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	List<Employee> employees;
	
}
