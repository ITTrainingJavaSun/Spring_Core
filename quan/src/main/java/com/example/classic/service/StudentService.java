package com.example.classic.service;

import com.example.classic.entity.Student;
import java.util.List;

public interface StudentService {
	
	void createStudent(Student student);
	
	List<Student> listAllStudents();
}
