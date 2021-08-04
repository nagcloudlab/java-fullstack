package com.example.repository;

import com.example.entity.Txn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TxnRepository extends JpaRepository<Txn,Integer> {
}
