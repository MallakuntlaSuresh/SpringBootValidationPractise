package com.validation.practise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.practise.models.Student;
import com.validation.practise.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {
	@RequestMapping()
	public void mm() {

	}

	@Autowired
	StudentService service;

	@PostMapping("/addstudent")
	public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student) {
		Student savedStudent = service.addStudent(student);
		return ResponseEntity.ok(savedStudent);
	}

}
