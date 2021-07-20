package com.example;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEES", schema = "EM_DB")
@NamedQueries(
		@NamedQuery(name = "findAll",query = "from Employee")		
)
@NamedNativeQueries(
	    @NamedNativeQuery(name="nativeFindAll",query = "select * from EMPLOYEES")	
)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", empProfile="
				+ empProfile + ", pic=" + Arrays.toString(pic) + ", nonColumnField=" + nonColumnField + "]";
	}
	
	
	
	

}
