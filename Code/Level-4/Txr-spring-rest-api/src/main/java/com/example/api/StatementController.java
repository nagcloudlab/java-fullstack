package com.example.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Txn;
import com.example.repository.TxnRepository;

@CrossOrigin(origins = {"*"})
@RestController()
@RequestMapping("/statement/txns")
public class StatementController {
	
	@Autowired
	TxnRepository txnRepository;
	
	
	@GetMapping(produces = {"application/json"})
	public List<Txn> getAllTxns() {
		return txnRepository.findAll();
	}
	
	
	@GetMapping(value="/{id}",produces = {"application/json"})
	public Txn getTxn(@PathVariable("id") int id) {
		System.out.println(id);
		return txnRepository.findById(id).get();
	}

}
