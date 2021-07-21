package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.entity.Todo;
import com.example.jpa.LocalEntityManageFactory;

public class JpaTodoRepository implements TodoRepository {

	@Override
	public void save(Todo todo) {

		EntityManager em = LocalEntityManageFactory.emf().createEntityManager();
		em.getTransaction().begin();

		em.persist(todo);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void updateTitle(int id, String newTitle) {

		EntityManager em = LocalEntityManageFactory.emf().createEntityManager();
		em.getTransaction().begin();

		Todo todo = em.find(Todo.class, id);
		todo.setTitle(newTitle);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void updateCompleted(int id, boolean completed) {

		EntityManager em = LocalEntityManageFactory.emf().createEntityManager();
		em.getTransaction().begin();

		Todo todo = em.find(Todo.class, id);
		todo.setCompleted(completed);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void delete(int id) {

		EntityManager em = LocalEntityManageFactory.emf().createEntityManager();
		em.getTransaction().begin();

		Todo todo = em.find(Todo.class, id);
		em.remove(todo);

		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void clearCompleted() {

		EntityManager em = LocalEntityManageFactory.emf().createEntityManager();
		em.getTransaction().begin();

		em.createQuery("delete from Todo where completed=false").executeUpdate();

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public List<Todo> getTodos() {
		EntityManager em = LocalEntityManageFactory.emf().createEntityManager();
		em.getTransaction().begin();

		List<Todo> todos = em.createQuery("from Todo").getResultList();

		em.getTransaction().commit();
		em.close();
		return todos;
	}

}
