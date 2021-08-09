package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.configuration.JpaConfiguration;
import com.example.entity.Txn;
import com.example.entity.TxnType;

public class JpaTxnRepository implements TxnRepository {

	@Override
	public void save(Txn txn) {
		EntityManager em=JpaConfiguration.em();
		em.getTransaction().begin();
		em.persist(txn);
		em.getTransaction().commit();
		em.close();
	}
	
	@Override
	public List<Txn> findAll() {
		EntityManager em=JpaConfiguration.em();
		List<Txn> txns=em.createQuery("from Txn").getResultList();
		em.close();
		return txns;
	}

	@Override
	public List<Txn> findByLimit(int limit) {
		EntityManager em=JpaConfiguration.em();
		Query query=em.createQuery("from Txn");
		query.setFirstResult(0);
		query.setMaxResults(limit);
		List<Txn> txns=query.getResultList();
		em.close();
		return txns;
	}

	@Override
	public List<Txn> findTxnType(TxnType txnType) {
		EntityManager em=JpaConfiguration.em();
		Query query=em.createQuery("from Txn where type=:txnType");
		query.setParameter("txnType", txnType);
		List<Txn> txns=query.getResultList();
		em.close();
		return txns;
	}

}
