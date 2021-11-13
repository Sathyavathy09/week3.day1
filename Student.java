package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student Name");

	}
	
	public void studentDept() {
		System.out.println("Student Department");

	}
	
	public void studentID() {
		System.out.println("Student ID");

	}
	

	public static void main(String[] args) {
		Student Sathya = new Student();
		Sathya.collegeName();
		Sathya.collegeCode();
		Sathya.collegeRank();
		Sathya.deptName();
		Sathya.studentName();
		Sathya.studentDept();
		Sathya.studentID();

	}

}
