package com.java.day3;

public class BoxEmploy {
	public void show(Object ob) {
		Employ e = (Employ)ob;
		System.out.println("Employ No  " +e.empno);
		System.out.println("Employ Name  " +e.name);
		System.out.println("Salary  " +e.basic);
	}
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno=1;
		employ.name="Anvesh";
		employ.basic=88244;
		new BoxEmploy().show(employ);
	}
}
