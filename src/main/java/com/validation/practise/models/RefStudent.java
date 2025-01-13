package com.validation.practise.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class RefStudent {

	@NotNull(message = "Student ID cannot be null")
	@Id
	@Min(value = 1, message = "Student ID must be a positive integer")
	private Integer studentId;

	@NotBlank(message = "Name cannot be blank")
	@Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
	private String name;

	@NotNull(message = "Age cannot be null")
	@Min(value = 18, message = "Age must be at least 18")
	@Max(value = 100, message = "Age cannot be greater than 100")
	private Integer age;

	@NotBlank(message = "Course cannot be blank")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Course name can only contain letters and spaces")
	@Size(min = 3, max = 30, message = "Course name must be between 3 and 30 characters")
	private String course;

	@Email(message = "Email should be valid")
	@NotBlank(message = "Email cannot be blank")
	private String email;

	@Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits")
	@NotBlank(message = "Phone number cannot be blank")
	private String phoneNumber;

	@Past(message = "Date of birth must be in the past")
	@NotNull(message = "Date of birth cannot be null")
	private LocalDate dateOfBirth;

	@NotNull(message = "GPA cannot be null")
	@DecimalMin(value = "0.0", inclusive = true, message = "GPA must be at least 0.0")
	@DecimalMax(value = "4.0", inclusive = true, message = "GPA must be at most 4.0")
	private Double gpa;

	@AssertTrue(message = "Terms must be accepted")
	private Boolean termsAccepted;

	@Size(min = 1, max = 5, message = "There must be between 1 and 5 enrolled courses")
	private List<@NotBlank(message = "Course name cannot be blank") String> enrolledCourses;

	@Pattern(regexp = "\\d{5}", message = "ZIP code must be exactly 5 digits")
	private String zipCode;

	// Optional details that are non-mandatory
	@Size(max = 100, message = "Address cannot exceed 100 characters")
	private String address;

	@Positive(message = "Credits must be positive")
	@NotNull(message = "Credits cannot be null")
	private Integer creditsCompleted;

	@FutureOrPresent(message = "Graduation date must be in the future or today")
	private LocalDate expectedGraduationDate;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public Boolean getTermsAccepted() {
		return termsAccepted;
	}

	public void setTermsAccepted(Boolean termsAccepted) {
		this.termsAccepted = termsAccepted;
	}

	public List<String> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(List<String> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCreditsCompleted() {
		return creditsCompleted;
	}

	public void setCreditsCompleted(Integer creditsCompleted) {
		this.creditsCompleted = creditsCompleted;
	}

	public LocalDate getExpectedGraduationDate() {
		return expectedGraduationDate;
	}

	public void setExpectedGraduationDate(LocalDate expectedGraduationDate) {
		this.expectedGraduationDate = expectedGraduationDate;
	}

}
