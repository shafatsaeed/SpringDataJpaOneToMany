package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/add/{name}")
	public List<Student> saveStudent(@PathVariable("name")String name ){
		Student student = new Student();
		student.setName(name);		
		
		Course course1 = new Course();
		course1.setCourseName("English");
		
		Course course2 = new Course();
		course2.setCourseName("Urdu");
		
		student.setCourses(Arrays.asList(course1, course2));
		
		studentService.save(student);
		return studentService.getAll();
		
	}
}
