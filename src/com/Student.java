package com;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private final String studentId;

	private String department;
	private int year;
	private String course;
	private String address;
	private StudentStatus status;

	private final ArrayList<Course> courses;

	private final Result result;
	private final Attendance attendance;

	public Student(String studentId, String name, int age, Gender gender, String phone, String email, String department,
			int year, String course, String address) {

		super(name, age, gender, phone, email);

		this.studentId = studentId;
		this.department = department;
		this.year = year;
		this.course = course;
		this.address = address;
		this.status = StudentStatus.ACTIVE;

		this.courses = new ArrayList<>();
		this.result = new Result();
		this.attendance = new Attendance();
	}

	@Override
	public String getRole() {
		return "Student";
	}

	public String getStudentId() {
		return studentId;
	}

	public String getDepartment() {
		return department;
	}

	public int getYear() {
		return year;
	}

	public String getCourse() {
		return course;
	}

	public String getAddress() {
		return address;
	}

	public StudentStatus getStatus() {
		return status;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setStatus(StudentStatus status) {
		this.status = status;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public Result getResult() {
		return result;
	}

	public Attendance getAttendance() {
		return attendance;
	}

	public void addCourse(Course course) {

		if (course != null && !courses.contains(course)) {
			courses.add(course);
		}
	}

	public void removeCourse(Course course) {
		courses.remove(course);
	}

	@Override
	public String toString() {

		return studentId + " - " + getName() + " - " + department + " - Year " + year;
	}
}

enum StudentStatus {
	ACTIVE, INACTIVE, GRADUATED, SUSPENDED
}
