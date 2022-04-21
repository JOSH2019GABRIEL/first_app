package com.example.first_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
//
//	@GetMapping("/students")
//	public Student getStudent() {
//		return new Student("Josh", "Virus");
//		}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Joshua","Gabriel"));
		students.add(new Student("Joseph","Akeh"));
		students.add(new Student("Jibrin","Kamaru"));
		students.add(new Student("Johnson","Peculiar"));
		students.add(new Student("Yusuf","Abdullahi"));
		
		return students;
	}
	
}
