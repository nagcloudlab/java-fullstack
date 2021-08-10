package com.example.api;


import java.util.List;

import com.example.entity.Txn;
import com.example.repository.JpaTxnRepository;
import com.example.repository.TxnRepository;

import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/statement/txns")
public class StatementController {
	
	TxnRepository txnRepository;
	
	@PostConstruct
	public void init() {
		txnRepository=new JpaTxnRepository();
	}
	
//
	@GET
	@Produces(value = "application/json")
	public List<Txn> getAllTxns() {
		return txnRepository.findAll();
	}
	
	
	@GET
	@Path("{id}")
	@Produces(value = "application/json")
	public Txn getTxn(@PathParam("id") int id) {
		System.out.println(id);
		return txnRepository.findById(id);
	}

}
