package com.jts.day3;

public class Student {
	int sno;
	String firstName;
	String lastName;
	String city;
	double cgp;
	
	public Student() {
	}

	public Student(int sno, String firstName, String lastName, String city, double cgp) {
		this.sno = sno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.cgp = cgp;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", cgp=" + cgp + "]";
	}
}
