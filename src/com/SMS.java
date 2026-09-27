package com;

import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
import java.util.List;

import java.util.Scanner;

public class SMS {

	private final Scanner scanner;

	private final ArrayList<Student> students;
	private final ArrayList<Course> courses;

	private int nextStudentId;
	private int nextCourseId;

	public SMS (Scanner scanner) {

		this.scanner = scanner;

		students = new ArrayList<>();
		courses = new ArrayList<>();

		nextStudentId = 6;
		nextCourseId = 5;

		loadSampleData();
	}


	public void run() {

		boolean running = true;

		System.out.println();
		System.out.println("==============================================");
		System.out.println(" STUDENT MANAGEMENT & ACADEMIC SYSTEM");
		System.out.println("==============================================");
		System.out.println("Sample data loaded successfully.");
		System.out.println("You can directly test the application.");
		System.out.println();

		while (running) {

			showMainMenu();

			int choice = readInt("Enter choice: ");

			switch (choice) {

			case 1:
				studentMenu();
				break;

			case 2:
				courseMenu();
				break;

			case 3:
				resultMenu();
				break;

			case 4:
				attendanceMenu();
				break;

			case 5:
				searchMenu();
				break;

			case 6:
				sortMenu();
				break;

			case 7:
				showDashboard();
				break;

			case 8:
				showTopPerformers();
				break;

			case 9:
				running = false;
				System.out.println("\nThank you for using SAMS.");
				break;

			default:
				System.out.println("Invalid choice. Enter 1 to 9.");
			}
		}
	}

	private void showMainMenu() {

		System.out.println();
		System.out.println("============== MAIN MENU ==============");
		System.out.println("1. Student Management");
		System.out.println("2. Course Management");
		System.out.println("3. Result Management");
		System.out.println("4. Attendance Management");
		System.out.println("5. Search");
		System.out.println("6. Sort Students");
		System.out.println("7. Dashboard");
		System.out.println("8. Top Performers");
		System.out.println("9. Exit");
		System.out.println("=======================================");
	}

	// =====================================================
	// SAMPLE DATA
	// =====================================================

	private void loadSampleData() {

		// ---------------- COURSES ----------------

		Course java = new Course("CRS001", "Java Full Stack", "CSE", 4);

		Course python = new Course("CRS002", "Python Development", "CSE", 4);

		Course dataScience = new Course("CRS003", "Data Science", "CSE", 4);

		Course electronics = new Course("CRS004", "Electronics Engineering", "ECE", 4);

		courses.add(java);
		courses.add(python);
		courses.add(dataScience);
		courses.add(electronics);

		// ---------------- STUDENTS ----------------

		Student s1 = new Student("STU001", "Rahul Kumar", 21, Gender.MALE, "9876543210", "rahul@gmail.com", "CSE", 4,
				"Computer Science", "Chennai");

		Student s2 = new Student("STU002", "Priya Sharma", 20, Gender.FEMALE, "9876543211", "priya@gmail.com", "CSE", 3,
				"Computer Science", "Bangalore");

		Student s3 = new Student("STU003", "Arun Kumar", 22, Gender.MALE, "9876543212", "arun@gmail.com", "ECE", 4,
				"Electronics", "Hyderabad");

		Student s4 = new Student("STU004", "Sneha Reddy", 19, Gender.FEMALE, "9876543213", "sneha@gmail.com", "CSE", 2,
				"Computer Science", "Vizag");

		Student s5 = new Student("STU005", "Vikram Singh", 21, Gender.MALE, "9876543214", "vikram@gmail.com", "ECE", 3,
				"Electronics", "Delhi");

		s2.setStatus(StudentStatus.ACTIVE);
		s3.setStatus(StudentStatus.GRADUATED);
		s4.setStatus(StudentStatus.ACTIVE);
		s5.setStatus(StudentStatus.INACTIVE);

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		// ---------------- ASSIGN COURSES ----------------

		s1.addCourse(java);
		s1.addCourse(dataScience);

		s2.addCourse(java);
		s2.addCourse(python);

		s3.addCourse(electronics);

		s4.addCourse(java);

		s5.addCourse(electronics);

		// ---------------- RESULTS ----------------

		s1.getResult().setMark("Java", 95);
		s1.getResult().setMark("SQL", 91);
		s1.getResult().setMark("HTML", 88);
		s1.getResult().setMark("CSS", 90);
		s1.getResult().setMark("JavaScript", 94);

		s2.getResult().setMark("Java", 85);
		s2.getResult().setMark("SQL", 82);
		s2.getResult().setMark("HTML", 89);
		s2.getResult().setMark("CSS", 84);
		s2.getResult().setMark("JavaScript", 87);

		s3.getResult().setMark("Java", 72);
		s3.getResult().setMark("SQL", 68);
		s3.getResult().setMark("HTML", 75);
		s3.getResult().setMark("CSS", 70);
		s3.getResult().setMark("JavaScript", 74);

		s4.getResult().setMark("Java", 91);
		s4.getResult().setMark("SQL", 94);
		s4.getResult().setMark("HTML", 90);
		s4.getResult().setMark("CSS", 92);
		s4.getResult().setMark("JavaScript", 96);

		s5.getResult().setMark("Java", 55);
		s5.getResult().setMark("SQL", 61);
		s5.getResult().setMark("HTML", 58);
		s5.getResult().setMark("CSS", 63);
		s5.getResult().setMark("JavaScript", 60);

		// ---------------- ATTENDANCE ----------------

		s1.getAttendance().update(100, 92);
		s2.getAttendance().update(100, 85);
		s3.getAttendance().update(100, 78);
		s4.getAttendance().update(100, 96);
		s5.getAttendance().update(100, 58);
	}

	// =====================================================
	// STUDENT MANAGEMENT
	// =====================================================

	private void studentMenu() {

		boolean back = false;

		while (!back) {

			System.out.println();
			System.out.println("========== STUDENT MANAGEMENT ==========");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. View Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Change Status");
			System.out.println("7. Assign Course");
			System.out.println("8. Remove Course");
			System.out.println("9. Back");

			int choice = readInt("Enter choice: ");

			switch (choice) {

			case 1:
				addStudent();
				break;

			case 2:
				viewAllStudents();
				break;

			case 3:
				viewStudent();
				break;

			case 4:
				updateStudent();
				break;

			case 5:
				deleteStudent();
				break;

			case 6:
				changeStatus();
				break;

			case 7:
				assignCourse();
				break;

			case 8:
				removeCourse();
				break;

			case 9:
				back = true;
				break;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private void addStudent() {

		System.out.println();
		System.out.println("========== ADD STUDENT ==========");

		String name = readName("Name: ");

		int age = readIntRange("Age: ", 15, 100);

		Gender gender = readGender();

		String phone = readPhone("Phone: ");

		while (phoneExists(phone, null)) {

			System.out.println("Phone already exists.");

			phone = readPhone("Phone: ");
		}

		String email = readEmail("Email: ");

		while (emailExists(email, null)) {

			System.out.println("Email already exists.");

			email = readEmail("Email: ");
		}

		String department = readText("Department: ");

		int year = readIntRange("Year (1-4): ", 1, 4);

		String course = readText("Main Course: ");

		String address = readText("Address: ");

		String id = String.format("STU%03d", nextStudentId++);

		Student student = new Student(id, name, age, gender, phone, email, department, year, course, address);

		students.add(student);

		System.out.println();
		System.out.println("Student added successfully.");

		System.out.println("Student ID: " + id);
	}

	private void viewAllStudents() {

		if (students.isEmpty()) {

			System.out.println("No students found.");

			return;
		}

		printStudents(students);
	}

	private void viewStudent() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		showStudentDetails(student);
	}

	private void updateStudent() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		System.out.println("Press Enter to keep the old value.");

		String name = readOptional("Name [" + student.getName() + "]: ");

		if (!name.isEmpty()) {

			if (isValidName(name)) {
				student.setName(name);
			} else {
				System.out.println("Invalid name.");
			}
		}

		String ageInput = readOptional("Age [" + student.getAge() + "]: ");

		if (!ageInput.isEmpty()) {

			try {

				int age = Integer.parseInt(ageInput);

				if (age >= 15 && age <= 100) {
					student.setAge(age);
				} else {
					System.out.println("Age must be 15-100.");
				}

			} catch (NumberFormatException e) {

				System.out.println("Invalid age.");
			}
		}

		String phone = readOptional("Phone [" + student.getPhone() + "]: ");

		if (!phone.isEmpty()) {

			if (!isValidPhone(phone)) {

				System.out.println("Phone must contain 10 digits.");

			} else if (phoneExists(phone, student)) {

				System.out.println("Phone already belongs to another student.");

			} else {

				student.setPhone(phone);
			}
		}

		String email = readOptional("Email [" + student.getEmail() + "]: ");

		if (!email.isEmpty()) {

			if (!isValidEmail(email)) {

				System.out.println("Invalid email.");

			} else if (emailExists(email, student)) {

				System.out.println("Email already belongs to another student.");

			} else {

				student.setEmail(email);
			}
		}

		String department = readOptional("Department [" + student.getDepartment() + "]: ");

		if (!department.isEmpty()) {
			student.setDepartment(department);
		}

		String yearInput = readOptional("Year [" + student.getYear() + "]: ");

		if (!yearInput.isEmpty()) {

			try {

				int year = Integer.parseInt(yearInput);

				if (year >= 1 && year <= 4) {
					student.setYear(year);
				} else {
					System.out.println("Year must be 1-4.");
				}

			} catch (NumberFormatException e) {

				System.out.println("Invalid year.");
			}
		}

		String course = readOptional("Course [" + student.getCourse() + "]: ");

		if (!course.isEmpty()) {
			student.setCourse(course);
		}

		String address = readOptional("Address [" + student.getAddress() + "]: ");

		if (!address.isEmpty()) {
			student.setAddress(address);
		}

		System.out.println("Student updated successfully.");
	}

	private void deleteStudent() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		String confirm = readText("Delete " + student.getName() + "? (Y/N): ");

		if (confirm.equalsIgnoreCase("Y")) {

			students.remove(student);

			System.out.println("Student deleted successfully.");

		} else {

			System.out.println("Delete cancelled.");
		}
	}

	private void changeStatus() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		System.out.println();
		System.out.println("1. ACTIVE");
		System.out.println("2. INACTIVE");
		System.out.println("3. GRADUATED");
		System.out.println("4. SUSPENDED");

		int choice = readInt("Status: ");

		StudentStatus status;

		switch (choice) {

		case 1:
			status = StudentStatus.ACTIVE;
			break;

		case 2:
			status = StudentStatus.INACTIVE;
			break;

		case 3:
			status = StudentStatus.GRADUATED;
			break;

		case 4:
			status = StudentStatus.SUSPENDED;
			break;

		default:
			System.out.println("Invalid status.");
			return;
		}

		student.setStatus(status);

		System.out.println("Status updated successfully.");
	}

	// =====================================================
	// COURSE MANAGEMENT
	// =====================================================

	private void courseMenu() {

		boolean back = false;

		while (!back) {

			System.out.println();
			System.out.println("========== COURSE MANAGEMENT ==========");
			System.out.println("1. Add Course");
			System.out.println("2. View Courses");
			System.out.println("3. Update Course");
			System.out.println("4. Delete Course");
			System.out.println("5. Back");

			int choice = readInt("Enter choice: ");

			switch (choice) {

			case 1:
				addCourse();
				break;

			case 2:
				viewCourses();
				break;

			case 3:
				updateCourse();
				break;

			case 4:
				deleteCourse();
				break;

			case 5:
				back = true;
				break;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private void addCourse() {

		String name = readText("Course name: ");

		String department = readText("Department: ");

		int duration = readIntRange("Duration: ", 1, 6);

		String id = String.format("CRS%03d", nextCourseId++);

		Course course = new Course(id, name, department, duration);

		courses.add(course);

		System.out.println("Course added successfully.");

		System.out.println("Course ID: " + id);
	}

	private void viewCourses() {

		if (courses.isEmpty()) {

			System.out.println("No courses found.");

			return;
		}

		System.out.println();
		System.out.println("================ COURSES ================");

		System.out.printf("%-10s %-25s %-15s %-10s%n", "ID", "COURSE", "DEPARTMENT", "DURATION");

		System.out.println("------------------------------------------------------------");

		for (Course course : courses) {

			System.out.printf("%-10s %-25s %-15s %-10d%n", course.getCourseId(), course.getCourseName(),
					course.getDepartment(), course.getDuration());
		}
	}

	private void updateCourse() {

		String id = readText("Course ID: ");

		Course course = findCourse(id);

		if (course == null) {

			System.out.println("Course not found.");

			return;
		}

		String name = readOptional("Name [" + course.getCourseName() + "]: ");

		if (!name.isEmpty()) {
			course.setCourseName(name);
		}

		String department = readOptional("Department [" + course.getDepartment() + "]: ");

		if (!department.isEmpty()) {
			course.setDepartment(department);
		}

		String duration = readOptional("Duration [" + course.getDuration() + "]: ");

		if (!duration.isEmpty()) {

			try {

				int value = Integer.parseInt(duration);

				if (value >= 1 && value <= 6) {
					course.setDuration(value);
				} else {
					System.out.println("Duration must be 1-6.");
				}

			} catch (NumberFormatException e) {

				System.out.println("Invalid duration.");
			}
		}

		System.out.println("Course updated successfully.");
	}

	private void deleteCourse() {

		String id = readText("Course ID: ");

		Course course = findCourse(id);

		if (course == null) {

			System.out.println("Course not found.");

			return;
		}

		if (isCourseAssigned(course)) {

			System.out.println("Course is assigned to a student.");

			System.out.println("Remove the assignment first.");

			return;
		}

		String confirm = readText("Delete course? (Y/N): ");

		if (confirm.equalsIgnoreCase("Y")) {

			courses.remove(course);

			System.out.println("Course deleted successfully.");

		} else {

			System.out.println("Delete cancelled.");
		}
	}

	private void assignCourse() {

		String studentId = readText("Student ID: ");

		Student student = findStudent(studentId);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		viewCourses();

		String courseId = readText("Course ID: ");

		Course course = findCourse(courseId);

		if (course == null) {

			System.out.println("Course not found.");

			return;
		}

		if (student.getCourses().contains(course)) {

			System.out.println("Course already assigned.");

			return;
		}

		student.addCourse(course);

		System.out.println("Course assigned successfully.");
	}

	private void removeCourse() {

		String studentId = readText("Student ID: ");

		Student student = findStudent(studentId);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		if (student.getCourses().isEmpty()) {

			System.out.println("No courses assigned.");

			return;
		}

		System.out.println("Assigned courses:");

		for (Course course : student.getCourses()) {

			System.out.println(course);
		}

		String courseId = readText("Course ID: ");

		Course course = findCourse(courseId);

		if (course == null || !student.getCourses().contains(course)) {

			System.out.println("Course is not assigned.");

			return;
		}

		student.removeCourse(course);

		System.out.println("Course removed successfully.");
	}

	private boolean isCourseAssigned(Course course) {

		for (Student student : students) {

			if (student.getCourses().contains(course)) {

				return true;
			}
		}

		return false;
	}

	// =====================================================
	// RESULT MANAGEMENT
	// =====================================================

	private void resultMenu() {

		boolean back = false;

		while (!back) {

			System.out.println();
			System.out.println("========== RESULT MANAGEMENT ==========");
			System.out.println("1. Enter / Update Marks");
			System.out.println("2. View Result");
			System.out.println("3. Clear Result");
			System.out.println("4. Back");

			int choice = readInt("Enter choice: ");

			switch (choice) {

			case 1:
				enterMarks();
				break;

			case 2:
				viewResult();
				break;

			case 3:
				clearResult();
				break;

			case 4:
				back = true;
				break;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private void enterMarks() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		int count = readIntRange("Number of subjects: ", 1, 10);

		for (int i = 1; i <= count; i++) {

			String subject = readText("Subject " + i + ": ");

			double mark = readDoubleRange("Marks: ", 0, 100);

			student.getResult().setMark(subject, mark);
		}

		System.out.println("Marks updated successfully.");
	}

	private void viewResult() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		Result result = student.getResult();

		if (!result.hasResult()) {

			System.out.println("No result available.");

			return;
		}

		System.out.println();
		System.out.println("========== RESULT ==========");

		System.out.println("Student : " + student.getName());

		System.out.println("ID      : " + student.getStudentId());

		System.out.println();

		System.out.printf("%-25s %-10s%n", "SUBJECT", "MARKS");

		System.out.println("-----------------------------------");

		for (Map.Entry<String, Double> entry : result.getSubjectMarks().entrySet()) {

			System.out.printf("%-25s %-10.2f%n", entry.getKey(), entry.getValue());
		}

		System.out.println();

		System.out.printf("Total      : %.2f%n", result.getTotal());

		System.out.printf("Average    : %.2f%n", result.getAverage());

		System.out.printf("Percentage : %.2f%%%n", result.getPercentage());

		System.out.println("Grade      : " + result.getGrade());

		System.out.println("Result     : " + result.getResultStatus());
	}

	private void clearResult() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		String confirm = readText("Clear result? (Y/N): ");

		if (confirm.equalsIgnoreCase("Y")) {

			student.getResult().clear();

			System.out.println("Result cleared.");

		} else {

			System.out.println("Operation cancelled.");
		}
	}

	// =====================================================
	// ATTENDANCE
	// =====================================================

	private void attendanceMenu() {

		boolean back = false;

		while (!back) {

			System.out.println();
			System.out.println("========== ATTENDANCE MANAGEMENT ==========");

			System.out.println("1. Update Attendance");
			System.out.println("2. View Attendance");
			System.out.println("3. Back");

			int choice = readInt("Enter choice: ");

			switch (choice) {

			case 1:
				updateAttendance();
				break;

			case 2:
				viewAttendance();
				break;

			case 3:
				back = true;
				break;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private void updateAttendance() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		int total = readIntRange("Total classes: ", 0, 10000);

		int present = readIntRange("Present classes: ", 0, total);

		student.getAttendance().update(total, present);

		System.out.println("Attendance updated successfully.");
	}

	private void viewAttendance() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

			return;
		}

		Attendance attendance = student.getAttendance();

		System.out.println();
		System.out.println("========== ATTENDANCE ==========");

		System.out.println("Student : " + student.getName());

		System.out.println("ID      : " + student.getStudentId());

		System.out.println("Total   : " + attendance.getTotalClasses());

		System.out.println("Present : " + attendance.getPresentClasses());

		System.out.println("Absent  : " + attendance.getAbsentClasses());

		System.out.printf("Percent : %.2f%%%n", attendance.getPercentage());

		System.out.println("Status  : " + attendance.getStatus());
	}

	// =====================================================
	// SEARCH
	// =====================================================

	private void searchMenu() {

		boolean back = false;

		while (!back) {

			System.out.println();
			System.out.println("============== SEARCH ==============");
			System.out.println("1. Search by ID");
			System.out.println("2. Search by Name");
			System.out.println("3. Search by Phone");
			System.out.println("4. Search by Email");
			System.out.println("5. Search by Department");
			System.out.println("6. Search by Course");
			System.out.println("7. Back");

			int choice = readInt("Enter choice: ");

			switch (choice) {

			case 1:
				searchById();
				break;

			case 2:
				searchByName();
				break;

			case 3:
				searchByPhone();
				break;

			case 4:
				searchByEmail();
				break;

			case 5:
				searchByDepartment();
				break;

			case 6:
				searchByCourse();
				break;

			case 7:
				back = true;
				break;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	private void searchById() {

		String id = readText("Student ID: ");

		Student student = findStudent(id);

		if (student == null) {

			System.out.println("Student not found.");

		} else {

			showStudentDetails(student);
		}
	}

	private void searchByName() {

		String name = readText("Name: ").toLowerCase();

		ArrayList<Student> result = new ArrayList<>();

		for (Student student : students) {

			if (student.getName().toLowerCase().contains(name)) {

				result.add(student);
			}
		}

		showSearchResults(result);
	}

	private void searchByPhone() {

		String phone = readText("Phone: ");

		ArrayList<Student> result = new ArrayList<>();

		for (Student student : students) {

			if (student.getPhone().equals(phone)) {

				result.add(student);
			}
		}

		showSearchResults(result);
	}

	private void searchByEmail() {

		String email = readText("Email: ");

		ArrayList<Student> result = new ArrayList<>();

		for (Student student : students) {

			if (student.getEmail().equalsIgnoreCase(email)) {

				result.add(student);
			}
		}

		showSearchResults(result);
	}

	private void searchByDepartment() {

		String department = readText("Department: ").toLowerCase();

		ArrayList<Student> result = new ArrayList<>();

		for (Student student : students) {

			if (student.getDepartment().toLowerCase().contains(department)) {

				result.add(student);
			}
		}

		showSearchResults(result);
	}

	private void searchByCourse() {

		String course = readText("Course: ").toLowerCase();

		ArrayList<Student> result = new ArrayList<>();

		for (Student student : students) {

			if (student.getCourse().toLowerCase().contains(course)) {

				result.add(student);
			}
		}

		showSearchResults(result);
	}

	private void showSearchResults(List<Student> result) {

		if (result.isEmpty()) {

			System.out.println("No students found.");

			return;
		}

		printStudents(result);
	}

	// =====================================================
	// SORT
	// =====================================================

	private void sortMenu() {

		if (students.isEmpty()) {

			System.out.println("No students available.");

			return;
		}

		System.out.println();
		System.out.println("========== SORT STUDENTS ==========");
		System.out.println("1. Name");
		System.out.println("2. Age");
		System.out.println("3. Student ID");
		System.out.println("4. Department");
		System.out.println("5. Percentage");
		System.out.println("6. Attendance");

		int choice = readInt("Enter choice: ");

		ArrayList<Student> sorted = new ArrayList<>(students);

		switch (choice) {

		case 1:

			sorted.sort(Comparator.comparing(Student::getName));

			break;

		case 2:

			sorted.sort(Comparator.comparingInt(Student::getAge));

			break;

		case 3:

			sorted.sort(Comparator.comparing(Student::getStudentId));

			break;

		case 4:

			sorted.sort(Comparator.comparing(Student::getDepartment));

			break;

		case 5:

			sorted.sort(Comparator.comparingDouble((Student s) -> s.getResult().getPercentage()).reversed());

			break;

		case 6:

			sorted.sort(Comparator.comparingDouble((Student s) -> s.getAttendance().getPercentage()).reversed());

			break;

		default:

			System.out.println("Invalid choice.");

			return;
		}

		printStudents(sorted);
	}

	// =====================================================
	// DASHBOARD
	// =====================================================

	private void showDashboard() {

		int active = 0;
		int inactive = 0;
		int graduated = 0;
		int suspended = 0;

		double totalPercentage = 0;
		int resultCount = 0;

		for (Student student : students) {

			switch (student.getStatus()) {

			case ACTIVE:
				active++;
				break;

			case INACTIVE:
				inactive++;
				break;

			case GRADUATED:
				graduated++;
				break;

			case SUSPENDED:
				suspended++;
				break;
			}

			if (student.getResult().hasResult()) {

				totalPercentage += student.getResult().getPercentage();

				resultCount++;
			}
		}

		double average = 0;

		if (resultCount > 0) {

			average = totalPercentage / resultCount;
		}

		System.out.println();
		System.out.println("============== DASHBOARD ==============");

		System.out.println("Total Students     : " + students.size());

		System.out.println("Active Students    : " + active);

		System.out.println("Inactive Students  : " + inactive);

		System.out.println("Graduated Students : " + graduated);

		System.out.println("Suspended Students : " + suspended);

		System.out.println("Total Courses      : " + courses.size());

		System.out.printf("Average Percentage : %.2f%%%n", average);
	}

	// =====================================================
	// TOP PERFORMERS
	// =====================================================

	private void showTopPerformers() {

		ArrayList<Student> resultStudents = new ArrayList<>();

		for (Student student : students) {

			if (student.getResult().hasResult()) {
				resultStudents.add(student);
			}
		}

		if (resultStudents.isEmpty()) {

			System.out.println("No result data available.");

			return;
		}

		resultStudents.sort(Comparator.comparingDouble((Student s) -> s.getResult().getPercentage()).reversed());

		System.out.println();
		System.out.println("========== TOP PERFORMERS ==========");

		int count = Math.min(5, resultStudents.size());

		for (int i = 0; i < count; i++) {

			Student student = resultStudents.get(i);

			System.out.printf("%d. %-20s %-10s %.2f%%%n", i + 1, student.getName(), student.getStudentId(),
					student.getResult().getPercentage());
		}
	}

	// =====================================================
	// DISPLAY STUDENT
	// =====================================================

	private void showStudentDetails(Student student) {

		System.out.println();
		System.out.println("========== STUDENT DETAILS ==========");

		System.out.println("ID         : " + student.getStudentId());

		System.out.println("Name       : " + student.getName());

		System.out.println("Age        : " + student.getAge());

		System.out.println("Gender     : " + student.getGender());

		System.out.println("Phone      : " + student.getPhone());

		System.out.println("Email      : " + student.getEmail());

		System.out.println("Department : " + student.getDepartment());

		System.out.println("Year       : " + student.getYear());

		System.out.println("Course     : " + student.getCourse());

		System.out.println("Address    : " + student.getAddress());

		System.out.println("Status     : " + student.getStatus());

		System.out.println();
		System.out.println("Assigned Courses:");

		if (student.getCourses().isEmpty()) {

			System.out.println("No courses assigned.");

		} else {

			for (Course course : student.getCourses()) {

				System.out.println("- " + course);
			}
		}

		System.out.printf("%nPercentage : %.2f%%%n", student.getResult().getPercentage());

		System.out.printf("Attendance : %.2f%%%n", student.getAttendance().getPercentage());
	}

	private void printStudents(List<Student> list) {

		System.out.println();
		System.out.println("================ STUDENTS ================");

		System.out.printf("%-10s %-20s %-15s %-6s %-12s %-12s%n", "ID", "NAME", "DEPARTMENT", "YEAR", "STATUS",
				"PERCENT");

		System.out.println("-----------------------------------------------------------------------");

		for (Student student : list) {

			System.out.printf("%-10s %-20s %-15s %-6d %-12s %-12.2f%n", student.getStudentId(), student.getName(),
					student.getDepartment(), student.getYear(), student.getStatus(),
					student.getResult().getPercentage());
		}
	}

	// =====================================================
	// FIND METHODS
	// =====================================================

	private Student findStudent(String id) {

		for (Student student : students) {

			if (student.getStudentId().equalsIgnoreCase(id)) {

				return student;
			}
		}

		return null;
	}

	private Course findCourse(String id) {

		for (Course course : courses) {

			if (course.getCourseId().equalsIgnoreCase(id)) {

				return course;
			}
		}

		return null;
	}

	// =====================================================
	// DUPLICATE CHECKING
	// =====================================================

	private boolean phoneExists(String phone, Student currentStudent) {

		for (Student student : students) {

			if (student == currentStudent) {
				continue;
			}

			if (student.getPhone().equals(phone)) {

				return true;
			}
		}

		return false;
	}

	private boolean emailExists(String email, Student currentStudent) {

		for (Student student : students) {

			if (student == currentStudent) {
				continue;
			}

			if (student.getEmail().equalsIgnoreCase(email)) {

				return true;
			}
		}

		return false;
	}

	// =====================================================
	// INPUT METHODS
	// =====================================================

	private String readText(String message) {

		while (true) {

			System.out.print(message);

			String input = scanner.nextLine().trim();

			if (!input.isEmpty()) {
				return input;
			}

			System.out.println("Input cannot be empty.");
		}
	}

	private String readOptional(String message) {

		System.out.print(message);

		return scanner.nextLine().trim();
	}

	private int readInt(String message) {

		while (true) {

			System.out.print(message);

			String input = scanner.nextLine().trim();

			try {

				return Integer.parseInt(input);

			} catch (NumberFormatException e) {

				System.out.println("Please enter a valid number.");
			}
		}
	}

	private int readIntRange(String message, int min, int max) {

		while (true) {

			int value = readInt(message);

			if (value >= min && value <= max) {
				return value;
			}

			System.out.println("Enter a value between " + min + " and " + max);
		}
	}

	private double readDoubleRange(String message, double min, double max) {

		while (true) {

			System.out.print(message);

			String input = scanner.nextLine().trim();

			try {

				double value = Double.parseDouble(input);

				if (value >= min && value <= max) {
					return value;
				}

				System.out.println("Enter a value between " + min + " and " + max);

			} catch (NumberFormatException e) {

				System.out.println("Please enter a valid number.");
			}
		}
	}

	private String readName(String message) {

		while (true) {

			String name = readText(message);

			if (isValidName(name)) {
				return name;
			}

			System.out.println("Enter a valid name.");
		}
	}

	private boolean isValidName(String name) {

		return name.matches("[a-zA-Z][a-zA-Z .'-]*");
	}

	private String readPhone(String message) {

		while (true) {

			String phone = readText(message);

			if (isValidPhone(phone)) {
				return phone;
			}

			System.out.println("Phone must contain exactly 10 digits.");
		}
	}

	private boolean isValidPhone(String phone) {

		return phone.matches("\\d{10}");
	}

	private String readEmail(String message) {

		while (true) {

			String email = readText(message);

			if (isValidEmail(email)) {
				return email;
			}

			System.out.println("Enter a valid email.");
		}
	}

	private boolean isValidEmail(String email) {

		return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
	}

	private Gender readGender() {

		while (true) {

			System.out.println();
			System.out.println("1. MALE");
			System.out.println("2. FEMALE");
			System.out.println("3. OTHER");

			int choice = readInt("Gender: ");

			switch (choice) {

			case 1:
				return Gender.MALE;

			case 2:
				return Gender.FEMALE;

			case 3:
				return Gender.OTHER;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
