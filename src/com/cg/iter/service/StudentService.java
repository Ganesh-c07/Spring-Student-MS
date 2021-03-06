package com.cg.iter.service;

import java.util.List;

import com.cg.iter.bean.Student;

public interface StudentService {

	boolean create(Student stud);
	Student findStudentById(int id);
	boolean updateStudent(Student id);
	boolean deleteStudent(int id);
	Student findStudentByName(String name);
	List<Student> findAllStudents();
	

	

}
