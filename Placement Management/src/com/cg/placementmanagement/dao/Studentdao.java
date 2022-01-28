package com.cg.placementmanagement.dao;

import com.cg.placementmanagement.entities.Student;
public interface Studentdao {
	
	public void addStudent(Student s);
	public void updateStudent(Student s);
	 public void deleteStudent(Student s);

	
	public void startTransaction();
	public void endTransaction();
	public void deleteStudent(int id);
	Student getStudent(int id);
	
}
