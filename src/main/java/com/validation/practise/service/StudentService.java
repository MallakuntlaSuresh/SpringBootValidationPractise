package com.validation.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.practise.models.Student;
import com.validation.practise.repo.StudentRepository;

import jakarta.validation.Valid;
@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

	public Student addStudent(@Valid Student student) {
		return repository.save(student);
	}

}
