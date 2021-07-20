package com.example;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES", schema = "EM_DB")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "E_ID")
	int id;
	String name;
	@Enumerated(EnumType.STRING)
	Gender gender;

//	@Embedded
//	Address address;
//
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name = "city",column = @Column(name="home_city")),
//		@AttributeOverride(name = "country",column = @Column(name="home_country"))
//	})
//	Address homeAddress;
	
	
	@ElementCollection
	@CollectionTable(name = "EMPLOYEE_ADDRESSES")
	List<Address> addresses;
	
	
}
