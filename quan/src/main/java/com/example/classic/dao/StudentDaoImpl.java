package com.example.classic.dao;

import com.example.classic.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
	
	private EntityManagerFactory entityManagerFactory;
	
	// Setter-based Dependency Injection
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
	
	@Override
	public void save(Student student) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
        em.getTransaction().begin(); 
        em.persist(student);
        em.getTransaction().commit();
        em.close(); 
	}
	
	@Override
	public List<Student> findAll() {
		EntityManager em = this.entityManagerFactory.createEntityManager();
        String jpql = "FROM Student";
        TypedQuery<Student> query = em.createQuery(jpql, Student.class);
        List<Student> students = query.getResultList();
        em.close();
        return students;
	}
}
