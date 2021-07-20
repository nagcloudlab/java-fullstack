package com.example;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Retreive {

	public static void main(String[] args) {

		// Using JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// by primary Key
		Employee employee = em.find(Employee.class, 2); // Managed State
		System.out.println(employee);
		
		employee.name="Indumathy";

		// by JPQL

		/*
		 * 
		 * SQL ==> based on relational model
		 * 
		 * JPQL ==> Object model
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

//		Query query = em.createQuery("from Employee"); // JPQL

//		String gender="'MALE' or 'a'='a'";
//		Query query = em.createQuery("from Employee e where e.gender="+gender); // JPQL

//		Query query = em.createQuery("from Employee e where e.gender=:genderType"); // JPQL
//		query.setParameter("genderType", Gender.MALE);

//		Query query = em.createQuery("from Employee"); // JPQL
//		query.setFirstResult(2);
//		query.setMaxResults(2);

//		List<Employee> employees = query.getResultList();
//		employees.forEach(System.out::println);

//		Query query = em.createQuery("select e.name,e.gender from Employee e"); // JPQL
//		List<Object[]> data = query.getResultList();
//		data.forEach(rec->{
//			System.out.println(rec[0]);
//			System.out.println(rec[1]);
//		});

//		Query query = em.createQuery("select new map(e.name,e.gender) from Employee e"); // JPQL
//		List<Map<?,?>> data = query.getResultList();
//		data.forEach(map->{
//			System.out.println(map.get("0"));
//		});

		// ----------------------------------------------------------------

		// by Criteria API

//		CriteriaBuilder criteriaBuilder=em.getCriteriaBuilder();
//		
//		
//		CriteriaQuery<Employee> criteriaQuery = 
//				  criteriaBuilder.createQuery(Employee.class);
//		
//		
//		Root<Employee> root=criteriaQuery.from(Employee.class);
//		
//		
//		criteriaQuery.where(criteriaBuilder.equal(root.get("name"), "Riya"));
//		
//	
//		CriteriaQuery<Employee> select= criteriaQuery.select(root);
//		
//		Query q = em.createQuery(select);  
//
//		List<Employee> employees = q.getResultList();
//		employees.forEach(System.out::println);

		// ----------------------------------------------------------------

		// by Native Query

//		Query query = em.createNativeQuery("select * from EMPLOYEES");
//		List<Object[]> employees = query.getResultList();
//		employees.forEach(oa->{
//			System.out.println(oa[1]);
//		});
		
		
//		----------------------------------------------------------------
//		
//		Query query=em.createNamedQuery("findAll");
//		List<Employee> employees = query.getResultList();
//		employees.forEach(System.out::println);

//		----------------------------------------------------------------
		

		em.getTransaction().commit();
		em.close();
	}

}
