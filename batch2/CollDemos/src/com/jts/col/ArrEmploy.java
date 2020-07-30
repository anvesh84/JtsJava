package com.jts.col;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
	public static void main(String[] args) {
		List emps = new ArrayList();
		emps.add(new Employ(1, "SaiNaveen", 88234));
		emps.add(new Employ(3, "Dasaraju", 62133));
		emps.add(new Employ(4, "Prasanna", 55233));
		emps.add(new Employ(5, "Sumanth", 88233));
		System.out.println("Employees are  ");
		for (Object ob : emps) {
			Employ emp = (Employ)ob;
			System.out.println(emp);
		}
	}
}
