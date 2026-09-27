package com;

public class Course {

	private final String courseId;

	private String courseName;
	private String department;
	private int duration;

	public Course(String courseId, String courseName, String department, int duration) {

		this.courseId = courseId;
		this.courseName = courseName;
		this.department = department;
		this.duration = duration;
	}

	public String getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getDepartment() {
		return department;
	}

	public int getDuration() {
		return duration;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {

		return courseId + " - " + courseName + " - " + department;
	}
}
