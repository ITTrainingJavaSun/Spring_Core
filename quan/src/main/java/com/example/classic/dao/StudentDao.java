package com.example.classic.dao;

import com.example.classic.entity.Student;
import java.util.List;

public interface StudentDao {
	
	void save(Student student);
	
	List<Student> findAll();
}
