package com.example;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEES", schema = "EM_DB")
public class Employee {

	@Id
	@Column(name = "E_ID")
	int id;
	String name;
	@Enumerated(EnumType.STRING)
	Gender gender;
	@Temporal(TemporalType.TIMESTAMP)
	Date dob;
	@Lob
	@Column(name = "emp_profile")
	String empProfile; // > 256
	@Lob
	byte[] pic;
	@Transient
	String nonColumnField;
	
	

}
