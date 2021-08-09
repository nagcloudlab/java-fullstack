package com.example.repository;

import java.util.List;

import com.example.entity.Txn;
import com.example.entity.TxnType;

public interface TxnRepository {

	void save(Txn txn);
	List<Txn> findAll();
	
	List<Txn> findByLimit(int limit);
	List<Txn> findTxnType(TxnType txnType);
	
	
	
}
