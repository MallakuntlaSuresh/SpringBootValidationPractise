package com.validation.practise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validation.practise.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
