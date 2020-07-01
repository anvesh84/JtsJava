package com.java.day3;

public class Emp {
	int empno;
	String firstName;
	String lastName;
	String city;
	double cgp;
	
	public Emp() {
	}
	public Emp(int empno, String firstName, String lastName, String city, double cgp) {
		this.empno = empno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", cgp=" + cgp + "]";
	}
	public static void main(String[] args) {
		Emp emp = new Emp(1, "Prasanth", "Reddy", "Hyderabad", 8.4);
		System.out.println(emp);
	}
}
