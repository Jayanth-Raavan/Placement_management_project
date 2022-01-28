package com.cg.placementmanagement.serve;

import com.cg.placementmanagement.entities.Student;
import com.cg.placementmanagement.service.StudentService;
import com.cg.placementmanagement.service.StudentServiceImpl;

public class Client {
public static void main(String[] args) {
	StudentService ss =new StudentServiceImpl();//upcasting ,downcasting
	Student s=new Student();
	s.setName("Harish");
	s.setHallTicketNo(1234);
	s.setCertificate("graduate");
	s.setId(012);
	s.setQualification("b.TECH");
	s.setRoll(17017);
	s.setYear(2022);
	ss.addStudent(s);
	
}
}
