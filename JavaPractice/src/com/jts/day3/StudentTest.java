package com.jts.day3;

public class StudentTest {
	public Student show(Student s) {
		s.firstName=s.firstName.toUpperCase();
		s.lastName=s.lastName.toUpperCase();
		return s;
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "Anvesh", "Bikkaji", "Hyderabad", 9.2);
		Student res = new StudentTest().show(s1);
		System.out.println(res);
	}
}
