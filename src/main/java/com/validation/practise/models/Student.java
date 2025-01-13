package com.validation.practise.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;

	@NotBlank(message = "Course cannot be blank")
	private String course;

	@NotNull(message = "GPA cannot be null")
	private Double gpa;

	@Positive(message = "Credits must be positive")
	@NotNull(message = "Credits cannot be null")
	private Integer creditsCompleted;

	@NotNull(message = "Age cannot be null")
	@Min(value = 18, message = "Age must be at least 18")
	@Max(value = 100, message = "Age cannot be greater than 100")
	private Integer age;
	@NotBlank(message = "Phone number cannot be blank")
	@Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits")
	private String phoneNumber;

	@NotNull(message = "Date of birth cannot be null")
	private LocalDate dateOfBirth;

	@NotBlank(message = "Name cannot be blank")
	private String name;

	@NotBlank(message = "Email cannot be blank")
	private String email;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public Integer getCreditsCompleted() {
		return creditsCompleted;
	}

	public void setCreditsCompleted(Integer creditsCompleted) {
		this.creditsCompleted = creditsCompleted;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
