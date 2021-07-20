package com.example;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	int id;
	String name;
	
	@ManyToMany(targetEntity = Employee.class)
	@JoinTable(
			name = "PROJS_EMPS",
			joinColumns = {@JoinColumn(name="P_ID")},
			inverseJoinColumns = {@JoinColumn(name="E_ID")}
			)
	List<Employee> employees;

}
