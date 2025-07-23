package com.example.classic.service;

import com.example.classic.dao.StudentDao;
import com.example.classic.entity.Student;
import java.util.List;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Override
	public void createStudent(Student student) {
		 System.out.println("Đang thực hiện nghiệp vụ tạo sinh viên...");
		 
		 studentDao.save(student);
	}
	
	@Override
    public List<Student> listAllStudents() {
        System.out.println("Đang thực hiện nghiệp vụ lấy danh sách sinh viên...");
        
        return studentDao.findAll();
	}
}
