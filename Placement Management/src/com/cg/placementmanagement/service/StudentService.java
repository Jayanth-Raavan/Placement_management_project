package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.Student;

public interface StudentService {
	public void addStudent(Student s);
	public void updateStudent(Student s);
	 public void deleteStudent(int id);
	public Student getStudent(int id);
	
}
