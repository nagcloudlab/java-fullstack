package com.example.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.entity.Txn;

public interface TxnRepository {

	void save(Txn txn);

	List<Txn> findByCount(int count, String accNum);
	List<Txn> findByMonth(int count, String accNum);
	List<Txn> findByDateRange(LocalDate fromDate,LocalDate toDate,String accNum);

}
