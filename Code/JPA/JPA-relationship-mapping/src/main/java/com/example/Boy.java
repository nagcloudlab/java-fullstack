package com.example;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Boy {

	@Id
	int id;
	String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "g_id")
	Girl girl;

}
