package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public void save(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> getAll(){
		return (List<Student>) studentRepository.findAll();
	}

}
