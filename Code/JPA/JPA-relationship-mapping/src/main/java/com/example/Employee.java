package com.example;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	int id;
	String name;
	
	@ManyToOne
	@JoinColumn(name = "dep_id")
	Department department;
	
	@ManyToMany(mappedBy = "employees",targetEntity = Project.class)
	List<Project> projects;
	
	

}
