package com.cg.placementmanagement.dao;

import com.cg.placementmanagement.entities.Student;
import javax.persistence.EntityManager;
public class StudentDaoImpl implements Studentdao {
	
	EntityManager em;
	public StudentDaoImpl() {
		em=Configuration.getEntityManager();
	}
	@Override
	public void addStudent(Student s) {
		em.persist(s);
		
	}
	@Override
	public void updateStudent(Student s) {
		em.merge(s);
		
	}
	@Override
	public void deleteStudent(Student s) {
		em.remove(s);
		
	}
	@Override
	public Student getStudent(int id) {
		Student s=em.find(Student.class,id);
		return s;
	}
	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}
	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}
	@Override
	public void deleteStudent(int id) {
		em.remove(id);
		
	}
	
	
	}

