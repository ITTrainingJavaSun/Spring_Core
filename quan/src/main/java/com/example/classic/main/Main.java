package com.example.classic.main;

import com.example.classic.entity.Student;
import com.example.classic.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Khoi tao ung dung");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("\n Spring Context duoc khoi tao");
		
		StudentService studentService = (StudentService)context.getBean("studentService");
		
		System.out.println("Da lay duoc bean 'studentService'\n");
		
		System.out.println("--- Tao sinh vien moi ---");
        Student newStudent = new Student();
        newStudent.setName("Nguyen Manh Quan");
        newStudent.setAge(30);
        studentService.createStudent(newStudent);
        
        System.out.println("--- Lay danh sach sinh vien ---");
        List<Student> students = studentService.listAllStudents();
        System.out.println("SERVICE ĐÃ TRẢ VỀ KẾT QUẢ. ĐANG IN RA TỪ HÀM MAIN:");
        for (Student student : students) {
            System.out.println("  - " + student);
        }
        
        // Dong ket noi CSDL mysql
        context.close();
        
        System.out.println("Ung dung ket thuc");
  
	}
}
