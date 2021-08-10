package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Txn;

@Repository
public interface TxnRepository  extends JpaRepository<Txn, Integer>{


	
}
