package com.cg.placementmanagement.service;

import com.cg.placementmanagement.dao.Studentdao;
import com.cg.placementmanagement.dao.StudentDaoImpl;
import com.cg.placementmanagement.entities.Student;

public class StudentServiceImpl implements StudentService {
Studentdao sd;
public StudentServiceImpl() {
sd=new StudentDaoImpl();
}
	@Override
	public void addStudent(Student s) {
		sd.startTransaction();
		sd.addStudent(s);
		sd.endTransaction();
		
	}

	@Override
	public void updateStudent(Student s) {
		sd.startTransaction();
		sd.updateStudent(s);
		sd.endTransaction();
		
	}

	@Override
	public void deleteStudent(int id) {
		sd.startTransaction();
		sd.deleteStudent(id);
		sd.endTransaction();
	}

	@Override
	public Student getStudent(int id) {
		Student s=sd.getStudent(id);
		return s;
	}
	
}

