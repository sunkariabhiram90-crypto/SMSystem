# Student Management & Academic System (SAMS)

A **Core Java console-based Student Management & Academic System** designed to practice and demonstrate important Java programming and Object-Oriented Programming concepts through a realistic academic management application.

The project manages students, courses, academic results, attendance, searching, sorting, dashboards, and top performers.

The application uses **in-memory data only**. It does not use file handling, databases, JDBC, Spring, Hibernate, or any external dependency.

---

## Table of Contents

1. [Project Overview](#project-overview)
2. [Objective](#objective)
3. [Why This Project](#why-this-project)
4. [Key Features](#key-features)
5. [Technologies Used](#technologies-used)
6. [Project Structure](#project-structure)
7. [Class Architecture](#class-architecture)
8. [Class Responsibilities](#class-responsibilities)
9. [OOP Concepts Used](#oop-concepts-used)
10. [Java Concepts Used](#java-concepts-used)
11. [Data Model](#data-model)
12. [Student Management](#student-management)
13. [Course Management](#course-management)
14. [Result Management](#result-management)
15. [Attendance Management](#attendance-management)
16. [Search Functionality](#search-functionality)
17. [Sorting Functionality](#sorting-functionality)
18. [Dashboard](#dashboard)
19. [Top Performers](#top-performers)
20. [Validation](#validation)
21. [Duplicate Prevention](#duplicate-prevention)
22. [Automatic ID Generation](#automatic-id-generation)
23. [Exception Handling](#exception-handling)
24. [Sample Data](#sample-data)
25. [Complete Program Flow](#complete-program-flow)
26. [Sample Input and Output](#sample-input-and-output)
27. [Student Management Output](#student-management-output)
28. [Course Management Output](#course-management-output)
29. [Result Management Output](#result-management-output)
30. [Attendance Output](#attendance-output)
31. [Search Output](#search-output)
32. [Sorting Output](#sorting-output)
33. [Dashboard Output](#dashboard-output)
34. [Top Performers Output](#top-performers-output)
35. [Result Calculation](#result-calculation)
36. [Attendance Calculation](#attendance-calculation)
37. [CRUD Operations](#crud-operations)
38. [Data Storage](#data-storage)
39. [How to Run](#how-to-run)
40. [Testing](#testing)
41. [Common Errors](#common-errors)
42. [Learning Outcomes](#learning-outcomes)
43. [Future Enhancements](#future-enhancements)
44. [Project Checklist](#project-checklist)
45. [Author](#author)

---

# Project Overview

**Student Management & Academic System (SAMS)** is a menu-driven Java console application.

It simulates a small academic management system where an administrator can manage:

- Students
- Courses
- Student-course assignments
- Academic marks
- Results
- Attendance
- Student status
- Searching
- Sorting
- Dashboard statistics
- Top performers

The project is intentionally built using **Core Java** so that the source code is easy to understand, modify, debug, and explain during interviews.

---

# Objective

The main objective of this project is to apply Java concepts in a practical application.

The project demonstrates:

- Classes and objects
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Constructors
- `this`
- `super`
- Method overriding
- `static`
- `final`
- Enums
- ArrayList
- LinkedHashMap
- Collections
- Comparator
- CRUD operations
- Exception handling
- Input validation
- String operations
- Searching
- Sorting
- Calculations
- Object relationships

The project focuses on **learning and practical implementation**, rather than creating a complicated enterprise application.

---

# Why This Project?

A basic Student Management System usually contains only:

```text
Add Student
View Student
Update Student
Delete Student

# Student Management & Academic System (SAMS)

## Key Features

### Student Management

* Add student
* Automatically generate Student ID
* View all students
* View individual student
* Update student details
* Delete student
* Change student status
* Assign courses to students
* Remove courses from students
* Search students
* Validate student information
* Prevent duplicate phone numbers
* Prevent duplicate email addresses

### Course Management

* Add course
* Automatically generate Course ID
* View all courses
* Update course details
* Delete course
* Prevent deletion of assigned courses
* Assign courses to students
* Remove courses from students

### Result Management

* Enter student marks
* Update existing marks
* View complete result
* Calculate total marks
* Calculate average marks
* Calculate percentage
* Automatically calculate grade
* Automatically determine PASS/FAIL
* Clear student result
* Validate marks between `0` and `100`

### Attendance Management

* Update attendance
* View attendance details
* Calculate attendance percentage
* Calculate present classes
* Calculate absent classes
* Automatically determine attendance status

Attendance status:

| Attendance      | Status  |
| --------------- | ------- |
| `75%` and above | GOOD    |
| `60% - 74.99%`  | WARNING |
| Below `60%`     | LOW     |

### Search Features

Students can be searched using:

* Student ID
* Student name
* Phone number
* Email address
* Department
* Course

Name searching supports partial and case-insensitive matching.

Example:

```text
Search: rah
```

Possible result:

```text
Rahul Kumar
```

### Sorting Features

Students can be sorted by:

1. Name
2. Age
3. Student ID
4. Department
5. Percentage
6. Attendance

Example:

```text
Sort Students
-------------
1. Name
2. Age
3. Student ID
4. Department
5. Percentage
6. Attendance

Enter choice: 5
```

Output:

```text
Students Sorted by Percentage

---------------------------------------------------------
ID       Name             Percentage
---------------------------------------------------------
STU004   Sneha Reddy      92.60%
STU001   Rahul Kumar      91.60%
STU002   Priya Sharma     85.40%
STU003   Arun Kumar       71.80%
---------------------------------------------------------
```

### Dashboard

The dashboard provides a quick summary of the academic system.

It displays:

* Total students
* Active students
* Inactive students
* Graduated students
* Suspended students
* Total courses
* Average student percentage

Example:

```text
==================== DASHBOARD ====================

Total Students       : 5
Active Students      : 4
Inactive Students    : 0
Graduated Students   : 1
Suspended Students   : 0

Total Courses        : 4
Average Percentage   : 80.12%

====================================================
```

### Top Performers

The system can display the top five students according to academic percentage.

Example:

```text
================ TOP PERFORMERS =================

Rank   Student ID   Name             Percentage
--------------------------------------------------
1      STU004       Sneha Reddy      92.60%
2      STU001       Rahul Kumar      91.60%
3      STU002       Priya Sharma     85.40%
4      STU003       Arun Kumar      71.80%
5      STU005       Vikram Singh     59.40%

==================================================
```

---

# Technologies Used

| Technology         | Usage                        |
| ------------------ | ---------------------------- |
| Java               | Main programming language    |
| Core Java          | Application development      |
| OOP                | Object-oriented design       |
| Scanner            | Dynamic user input           |
| ArrayList          | Store students and courses   |
| LinkedHashMap      | Store subject marks          |
| Enum               | Gender and student status    |
| Exception Handling | Handle invalid input         |
| Comparator         | Sorting students             |
| VS Code / Eclipse  | Development                  |
| JDK                | Compile and run Java program |

---

# Project Structure

```text
SAMS/
│
├── Main.java
├── StudentManagementSystem.java
├── Person.java
├── Student.java
├── Course.java
├── Result.java
└── Attendance.java
```

The project contains only **7 Java files**.

There is no:

* Database
* File handling
* Serialization
* JDBC
* MySQL
* Oracle
* Spring
* Spring Boot
* Hibernate
* GUI
* External library

---

# Class Architecture

```text
                 Person
                   |
                   |
                Student
                   |
        -----------------------
        |          |          |
      Course     Result   Attendance
```

### Relationship

`Person` is the parent class.

`Student` inherits from `Person`.

A `Student` has:

* Multiple `Course` objects
* One `Result` object
* One `Attendance` object

---

# Class Responsibilities

## Main.java

Responsible for starting the application.

```java
public static void main(String[] args)
```

It creates:

```java
Scanner scanner = new Scanner(System.in);
```

Then creates the management system:

```java
StudentManagementSystem system =
        new StudentManagementSystem(scanner);
```

Finally:

```java
system.run();
```

---

## Person.java

`Person` is an abstract parent class.

It contains common personal information:

```text
Name
Age
Gender
Phone
Email
```

Example:

```java
public abstract class Person
```

It also contains the abstract method:

```java
public abstract String getRole();
```

---

## Student.java

`Student` extends `Person`.

It contains student-specific information:

```text
Student ID
Department
Year
Course
Address
Status
Courses
Result
Attendance
```

Inheritance:

```java
public class Student extends Person
```

---

## Course.java

Represents a course available in the academic system.

Information includes:

```text
Course ID
Course Name
Department
Duration
```

Example:

```text
CRS001
Java Programming
Computer Science
6 Months
```

---

## Result.java

Responsible for student academic results.

It stores:

```text
Subject
Marks
```

It calculates:

```text
Total
Average
Percentage
Grade
Pass/Fail
```

---

## Attendance.java

Responsible for attendance information.

It stores:

```text
Total Classes
Present
Absent
```

It calculates:

```text
Attendance Percentage
Attendance Status
```

---

## StudentManagementSystem.java

This is the main controller class.

It manages:

* Main menu
* Student menu
* Course menu
* Result menu
* Attendance menu
* Search
* Sorting
* Dashboard
* Top performers
* Validation
* CRUD operations

---

# Object-Oriented Programming Concepts

This project is designed to demonstrate important Core Java OOP concepts.

## 1. Encapsulation

Data members are declared as `private`.

Example:

```java
private String name;
private int age;
private String email;
```

Access is provided through getters and setters.

```java
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

This protects the object's internal data.

---

# 2. Inheritance

`Student` inherits from `Person`.

```java
public class Student extends Person
```

Therefore, Student can use:

```text
Name
Age
Gender
Phone
Email
```

without declaring them again.

---

# 3. Abstraction

`Person` is declared as an abstract class.

```java
public abstract class Person
```

It contains an abstract method:

```java
public abstract String getRole();
```

The child class provides its implementation.

---

# 4. Polymorphism

The `getRole()` method is overridden by `Student`.

Parent:

```java
public abstract String getRole();
```

Child:

```java
@Override
public String getRole() {
    return "Student";
}
```

This demonstrates runtime polymorphism.

---

# 5. Constructor

Constructors are used to initialize objects.

Example:

```java
public Student(
        String studentId,
        String name,
        int age,
        Gender gender,
        String phone,
        String email,
        String department,
        int year,
        String course,
        String address,
        StudentStatus status) {

    super(name, age, gender, phone, email);

    this.studentId = studentId;
    this.department = department;
    this.year = year;
    this.course = course;
    this.address = address;
    this.status = status;
}
```

---

# 6. this Keyword

The `this` keyword refers to the current object.

Example:

```java
this.name = name;
```

Here:

```text
this.name
```

refers to the instance variable.

```text
name
```

refers to the constructor parameter.

---

# 7. super Keyword

The `super` keyword is used to call the parent constructor.

Example:

```java
super(name, age, gender, phone, email);
```

This calls the constructor of `Person`.

---

# 8. Method Overriding

Student overrides the parent's `getRole()` method.

```java
@Override
public String getRole() {
    return "Student";
}
```

---

# 9. static

Static constants are used where values belong to the class rather than an individual object.

Example:

```java
public static final int MAX_MARKS = 100;
```

---

# 10. final

Student IDs and Course IDs can be made immutable.

Example:

```java
private final String studentId;
```

Once assigned, the ID cannot be changed.

This prevents accidental modification of unique identifiers.

---

# 11. Enum

Enums are used for fixed values.

Gender:

```java
enum Gender {
    MALE,
    FEMALE,
    OTHER
}
```

Student status:

```java
enum StudentStatus {
    ACTIVE,
    INACTIVE,
    GRADUATED,
    SUSPENDED
}
```

---

# Collections Used

## ArrayList

Students are stored using:

```java
ArrayList<Student> students;
```

Courses are stored using:

```java
ArrayList<Course> courses;
```

Advantages:

* Dynamic size
* Easy insertion
* Easy deletion
* Easy searching
* Easy iteration

---

## LinkedHashMap

Subject marks are stored using:

```java
LinkedHashMap<String, Double>
```

Example:

```text
Java       -> 95
SQL        -> 89
HTML       -> 91
JavaScript -> 94
```

`LinkedHashMap` maintains insertion order.

---

# Data Model

## Student

```text
Student
│
├── Student ID
├── Name
├── Age
├── Gender
├── Phone
├── Email
├── Department
├── Year
├── Course
├── Address
├── Status
│
├── Courses
│
├── Result
│   ├── Subject Marks
│   ├── Total
│   ├── Average
│   ├── Percentage
│   └── Grade
│
└── Attendance
    ├── Total Classes
    ├── Present
    ├── Absent
    ├── Percentage
    └── Status
```

---

# Student ID Generation

Student IDs are generated automatically.

The first student receives:

```text
STU001
```

The next student:

```text
STU002
```

Then:

```text
STU003
STU004
STU005
```

The user does not have to enter the ID manually.

---

# Course ID Generation

Course IDs are also generated automatically.

Example:

```text
CRS001
CRS002
CRS003
CRS004
```

This prevents accidental duplicate course IDs.

---

# CRUD Operations

CRUD means:

```text
C - Create
R - Read
U - Update
D - Delete
```

The project implements CRUD for students and courses.

## Create

Example:

```text
Add Student
```

The user enters student details.

---

## Read

Example:

```text
View All Students
```

The system displays all students.

---

## Update

Example:

```text
Update Student
```

The user can modify student information.

---

## Delete

Example:

```text
Delete Student
```

The system asks for confirmation before deletion.

```text
Are you sure you want to delete this student? (Y/N):
```

---

# Student Management Input Example

```text
================ STUDENT MANAGEMENT ================

1. Add Student
2. View All Students
3. View Student
4. Update Student
5. Delete Student
6. Change Status
7. Assign Course
8. Remove Course
9. Back

Enter choice: 1
```

Input:

```text
Enter Name: Rahul Kumar
Enter Age: 22
Enter Gender: MALE
Enter Phone: 9876543210
Enter Email: rahul@gmail.com
Enter Department: Computer Science
Enter Year: 4
Enter Course: Java Full Stack
Enter Address: Bangalore
Enter Status: ACTIVE
```

Output:

```text
Student added successfully.

Student ID: STU006
```

---

# View Student Example

Input:

```text
Enter Student ID: STU001
```

Output:

```text
================ STUDENT DETAILS ================

Student ID   : STU001
Name         : Rahul Kumar
Age          : 22
Gender       : MALE
Phone        : 9876543210
Email        : rahul@gmail.com
Department   : Computer Science
Year         : 4
Course       : Java Full Stack
Address      : Bangalore
Status       : ACTIVE

Assigned Courses:
1. Java Programming
2. Database Management
3. Web Technologies

==================================================
```

---

# Update Student Example

```text
Enter Student ID: STU001

Current Name: Rahul Kumar
Enter New Name: Rahul Kumar

Current Age: 22
Enter New Age: 23

Current Phone: 9876543210
Enter New Phone: 9876543210

Current Email: rahul@gmail.com
Enter New Email: rahul@gmail.com

Student updated successfully.
```

---

# Delete Student Example

```text
Enter Student ID: STU005

Student Found:
Vikram Singh

Are you sure you want to delete this student? (Y/N): Y

Student deleted successfully.
```

If the user enters:

```text
N
```

Output:

```text
Deletion cancelled.
```

---

# Course Management Example

```text
================ COURSE MANAGEMENT ================

1. Add Course
2. View Courses
3. Update Course
4. Delete Course
5. Back

Enter choice: 1
```

Input:

```text
Enter Course Name: Spring Framework
Enter Department: Computer Science
Enter Duration: 6 Months
```

Output:

```text
Course added successfully.

Course ID: CRS005
```

---

# Result Calculation

Suppose a student has the following marks:

```text
Java          : 95
SQL           : 90
HTML          : 88
JavaScript    : 92
```

Total:

```text
95 + 90 + 88 + 92 = 365
```

Number of subjects:

```text
4
```

Average:

```text
365 / 4 = 91.25
```

Percentage:

```text
91.25%
```

Grade:

```text
A+
```

Result:

```text
PASS
```

---

# Grade System

| Percentage | Grade |
| ---------: | :---- |
|   90 - 100 | A+    |
| 80 - 89.99 | A     |
| 70 - 79.99 | B     |
| 60 - 69.99 | C     |
| 50 - 59.99 | D     |
|   Below 50 | F     |

---

# Result Input Example

```text
================ RESULT MANAGEMENT ================

1. Enter / Update Marks
2. View Result
3. Clear Result
4. Back

Enter choice: 1

Enter Student ID: STU001

Enter Subject: Java
Enter Marks: 95

Enter Subject: SQL
Enter Marks: 90

Enter Subject: HTML
Enter Marks: 88

Enter Subject: JavaScript
Enter Marks: 92
```

Output:

```text
Result updated successfully.
```

---

# View Result Example

```text
================ STUDENT RESULT ================

Student ID : STU001
Name       : Rahul Kumar

Subject             Marks
--------------------------------
Java                95.00
SQL                 90.00
HTML                88.00
JavaScript          92.00
--------------------------------

Total               : 365.00
Average             : 91.25
Percentage          : 91.25%
Grade               : A+
Result              : PASS

=================================================
```

---

# Invalid Marks Example

Input:

```text
Enter Marks: 105
```

Output:

```text
Invalid marks.
Marks must be between 0 and 100.
```

Another example:

```text
Enter Marks: -10
```

Output:

```text
Invalid marks.
Marks must be between 0 and 100.
```

---

# Attendance Calculation

Suppose:

```text
Total Classes = 100
Present       = 85
Absent        = 15
```

Attendance percentage:

```text
(85 / 100) × 100
```

Result:

```text
85%
```

Status:

```text
GOOD
```

---

# Attendance Input Example

```text
================ ATTENDANCE MANAGEMENT ================

1. Update Attendance
2. View Attendance
3. Back

Enter choice: 1

Enter Student ID: STU001
Enter Total Classes: 100
Enter Present Classes: 85
```

Output:

```text
Attendance updated successfully.
```

---

# Attendance Output Example

```text
================ ATTENDANCE =================

Student ID       : STU001
Student Name     : Rahul Kumar

Total Classes    : 100
Present          : 85
Absent           : 15

Attendance       : 85.00%
Status           : GOOD

==============================================
```

---

# Invalid Attendance Example

Input:

```text
Total Classes: 50
Present Classes: 60
```

Output:

```text
Invalid attendance.

Present classes cannot be greater than
total classes.
```

---

# Search Example

```text
================ SEARCH ================

1. Search by ID
2. Search by Name
3. Search by Phone
4. Search by Email
5. Search by Department
6. Search by Course
7. Back

Enter choice: 2

Enter student name: rah
```

Output:

```text
Search Results
--------------------------------------------

STU001   Rahul Kumar
STU006   Rahul Sharma

--------------------------------------------
```

The search is case-insensitive.

Therefore:

```text
rah
Rah
RAH
RaH
```

can all match the same student.

---

# Duplicate Validation

The system prevents duplicate phone numbers.

Example:

```text
Enter Phone: 9876543210
```

If another student already uses that phone number:

```text
Phone number already exists.

Please enter a different phone number.
```

The same validation is applied to email addresses.

---

# Course Assignment

A student can be assigned to available courses.

Example:

```text
Enter Student ID: STU001

Available Courses:

CRS001 - Java Programming
CRS002 - Database Management
CRS003 - Web Technologies
CRS004 - Data Structures

Enter Course ID: CRS001
```

Output:

```text
Course assigned successfully.
```

---

# Duplicate Course Assignment

If the student already has the course:

```text
Enter Course ID: CRS001
```

Output:

```text
Student is already assigned to this course.
```

The same course will not be added twice.

---

# Course Deletion Validation

A course cannot be deleted while it is assigned to a student.

Example:

```text
Enter Course ID: CRS001
```

Output:

```text
Course cannot be deleted.

This course is currently assigned to one or more students.
Remove the course assignments first.
```

This prevents invalid relationships.

---

# Student Status

Each student can have one of the following statuses:

```text
ACTIVE
INACTIVE
GRADUATED
SUSPENDED
```

Example:

```text
Enter Student ID: STU003

Current Status: ACTIVE

Select New Status:
1. ACTIVE
2. INACTIVE
3. GRADUATED
4. SUSPENDED

Enter choice: 3
```

Output:

```text
Student status updated successfully.

New Status: GRADUATED
```

---

# Exception Handling

The application validates incorrect user input.

Example:

```text
Enter Age: abc
```

Instead of crashing, the application displays:

```text
Invalid input.

Please enter a valid number.
```

Another example:

```text
Enter Marks: xyz
```

Output:

```text
Invalid marks.

Please enter a numeric value.
```

The project uses exception handling such as:

```java
try {
    int value = Integer.parseInt(input);
} catch (NumberFormatException e) {
    System.out.println("Invalid number.");
}
```

---

# Input Validation

The project validates:

* Empty names
* Invalid ages
* Invalid years
* Invalid phone numbers
* Invalid email addresses
* Duplicate phone numbers
* Duplicate email addresses
* Invalid marks
* Invalid attendance
* Invalid student IDs
* Invalid course IDs
* Duplicate course assignments
* Invalid menu choices
* Invalid confirmation input

---

# Sample Data

The application starts with sample data so that the user can immediately test the system.

Example students:

| ID     | Name         | Department             | Status    |
| ------ | ------------ | ---------------------- | --------- |
| STU001 | Rahul Kumar  | Computer Science       | ACTIVE    |
| STU002 | Priya Sharma | Information Technology | ACTIVE    |
| STU003 | Arun Kumar   | Computer Science       | ACTIVE    |
| STU004 | Sneha Reddy  | Electronics            | ACTIVE    |
| STU005 | Vikram Singh | Mechanical             | GRADUATED |

Example courses:

| ID     | Course              | Department             |
| ------ | ------------------- | ---------------------- |
| CRS001 | Java Programming    | Computer Science       |
| CRS002 | Database Management | Computer Science       |
| CRS003 | Web Technologies    | Information Technology |
| CRS004 | Data Structures     | Computer Science       |

---

# In-Memory Data Storage

This project intentionally uses **in-memory storage**.

Student data is stored in:

```java
ArrayList<Student>
```

Course data is stored in:

```java
ArrayList<Course>
```

Subject marks are stored in:

```java
LinkedHashMap<String, Double>
```

This means the application does not permanently save data.

---

# No File Handling

This project does **not** use file handling.

There is no:

```text
File
FileReader
FileWriter
BufferedReader
BufferedWriter
ObjectInputStream
ObjectOutputStream
Serializable
IOException
```

There is also no:

```text
.dat
.csv
.txt
```

data storage.

When the application is closed, the data in memory is removed.

When the application is started again, the sample data is loaded again.

---

# Program Flow

The application follows this basic flow:

```text
Start
  |
  v
Main.java
  |
  v
StudentManagementSystem
  |
  v
Load Sample Data
  |
  v
Display Main Menu
  |
  +----> Student Management
  |
  +----> Course Management
  |
  +----> Result Management
  |
  +----> Attendance Management
  |
  +----> Search
  |
  +----> Sort
  |
  +----> Dashboard
  |
  +----> Top Performers
  |
  v
Exit
```

---

# Main Menu

When the application starts:

```text
=================================================
       STUDENT MANAGEMENT & ACADEMIC SYSTEM
=================================================

1. Student Management
2. Course Management
3. Result Management
4. Attendance Management
5. Search
6. Sort Students
7. Dashboard
8. Top Performers
9. Exit

Enter choice:
```

---

# Complete Demo Flow

A typical application session can look like this:

```text
Start Application
        |
        v
View Students
        |
        v
Add New Student
        |
        v
Assign Course
        |
        v
Enter Marks
        |
        v
Update Attendance
        |
        v
View Result
        |
        v
View Attendance
        |
        v
Search Student
        |
        v
Sort Students
        |
        v
View Dashboard
        |
        v
View Top Performers
        |
        v
Exit
```

---

# Testing Checklist

The following features should be tested before considering the project complete.

## Student Testing

```text
[ ] Add student
[ ] View all students
[ ] View individual student
[ ] Update student
[ ] Delete student
[ ] Change status
[ ] Assign course
[ ] Remove course
```

## Course Testing

```text
[ ] Add course
[ ] View courses
[ ] Update course
[ ] Delete course
[ ] Prevent deletion of assigned course
```

## Result Testing

```text
[ ] Add marks
[ ] Update marks
[ ] View result
[ ] Calculate total
[ ] Calculate average
[ ] Calculate percentage
[ ] Calculate grade
[ ] Calculate pass/fail
[ ] Clear result
[ ] Reject marks below 0
[ ] Reject marks above 100
```

## Attendance Testing

```text
[ ] Update attendance
[ ] View attendance
[ ] Calculate percentage
[ ] Calculate absent classes
[ ] Validate present <= total
[ ] Check attendance status
```

## Search Testing

```text
[ ] Search by ID
[ ] Search by name
[ ] Search by phone
[ ] Search by email
[ ] Search by department
[ ] Search by course
```

## Sorting Testing

```text
[ ] Sort by name
[ ] Sort by age
[ ] Sort by ID
[ ] Sort by department
[ ] Sort by percentage
[ ] Sort by attendance
```

---

# How to Run

## Step 1: Open Project Folder

Open the project folder in VS Code or Eclipse.

Example:

```text
C:\Coding\java\SAMS
```

---

## Step 2: Check Java Version

Open PowerShell or Command Prompt:

```powershell
java -version
```

Example:

```text
java version "26.0.2.1"
```

Check compiler:

```powershell
javac -version
```

---

## Step 3: Compile

Navigate to the project directory:

```powershell
cd C:\Coding\java\SAMS
```

Compile all Java files:

```powershell
javac *.java
```

If there are no errors, the project compiled successfully.

---

## Step 4: Run

Execute:

```powershell
java Main
```

The application will start.

---

# Expected Startup Output

```text
=================================================
       STUDENT MANAGEMENT & ACADEMIC SYSTEM
=================================================

Sample data loaded successfully.

1. Student Management
2. Course Management
3. Result Management
4. Attendance Management
5. Search
6. Sort Students
7. Dashboard
8. Top Performers
9. Exit

Enter choice:
```

---

# Common Compilation Problem

If you see:

```text
Could not find or load main class Main
```

make sure you are inside the directory containing:

```text
Main.java
StudentManagementSystem.java
Person.java
Student.java
Course.java
Result.java
Attendance.java
```

Then run:

```powershell
javac *.java
java Main
```

---

# Why This Project Is Good for Java Practice

This project combines several Core Java concepts into one practical application.

You can practice:

```text
Classes
Objects
Constructors
Encapsulation
Inheritance
Abstraction
Polymorphism
Method Overriding
this
super
static
final
Enums
ArrayList
LinkedHashMap
Comparator
Scanner
Exception Handling
CRUD
Searching
Sorting
Validation
```

Instead of learning these concepts separately, they are used together in a single application.

---

# Interview Explanation

A simple way to explain the project in an interview:

> "I developed a console-based Student Management & Academic System using Core Java. The application manages students, courses, academic results, and attendance. I used OOP concepts such as encapsulation, inheritance, abstraction, and polymorphism. Student data is maintained using ArrayList, while subject marks are stored using LinkedHashMap. The application also provides CRUD operations, search, sorting, validation, result calculation, attendance calculation, dashboard statistics, and top-performer analysis. The application uses in-memory storage and does not use a database or file handling."

---

# OOP Explanation for Interview

### Encapsulation

> I used private fields with getters and setters to protect object data.

### Inheritance

> Student extends Person to reuse common personal information.

### Abstraction

> Person is an abstract class containing the abstract getRole() method.

### Polymorphism

> Student overrides getRole(), demonstrating runtime polymorphism.

### Collections

> ArrayList is used for students and courses, while LinkedHashMap is used for subject marks.

### Exception Handling

> try-catch blocks are used to handle invalid numeric input and prevent the application from terminating unexpectedly.

---

# Example Interview Question

### Why did you use ArrayList?

Answer:

> "I used ArrayList because the number of students and courses can change during program execution. ArrayList provides dynamic sizing and makes adding, removing, searching, and iterating through objects simple."

---

### Why did you use LinkedHashMap for marks?

Answer:

> "I used LinkedHashMap to store subject names and their marks as key-value pairs. It also maintains insertion order, so the subjects appear in the same order in which they were entered."

---

### Why did you make Person abstract?

Answer:

> "Person contains common information shared by different types of people. I don't need to create a generic Person object directly, so I used an abstract class. Student extends Person and provides the implementation of getRole()."

---

### Why are Student IDs final?

Answer:

> "The Student ID uniquely identifies a student, so it should not change after the student is created. Making it final prevents accidental modification."

---

# Future Enhancements

The current version intentionally focuses on Core Java.

Possible future improvements include:

```text
Database integration
JDBC
MySQL
User authentication
Admin login
Role-based access
Student login
REST API
Spring Boot
Web interface
GUI
Report generation
Export to CSV
Email notifications
Password authentication
```

These features are intentionally not included in the current version so that the project remains focused on Core Java and OOP.

---

# Project Limitations

The current project has some intentional limitations:

* Data is stored only in memory.
* Data is lost when the application closes.
* No database is used.
* No file handling is used.
* No login system is implemented.
* No web interface is implemented.
* No external API is used.
* No external dependencies are required.

These limitations keep the project suitable for learning Core Java.

---

# Learning Outcomes

After completing this project, you should be able to understand:

* How to create classes and objects
* How constructors work
* How inheritance works
* How abstraction works
* How polymorphism works
* How encapsulation protects data
* How to use `this`
* How to use `super`
* How to use `static`
* How to use `final`
* How to create enums
* How to use ArrayList
* How to use LinkedHashMap
* How to use Comparator
* How to accept dynamic input using Scanner
* How to validate user input
* How to handle exceptions
* How to implement CRUD operations
* How to search objects
* How to sort objects
* How to calculate academic results
* How to calculate attendance
* How to organize a multi-file Java project

---


---

# Conclusion

The **Student Management & Academic System (SAMS)** is a Core Java console application designed to provide practical experience with object-oriented programming and application development.

The project combines:

```text
OOP
   +
Collections
   +
CRUD
   +
Validation
   +
Exception Handling
   +
Searching
   +
Sorting
   +
Result Management
   +
Attendance Management
```

The application is intentionally kept simple enough for a beginner/intermediate Java developer to understand while still providing enough functionality to demonstrate practical programming skills.

---

# Author

**Sunkari Abhiram**

Java Full Stack Developer

---
