package com.jts.day3;

public class EmpArray {
	public Employ[] show() {
		Employ[] names = new Employ[] {
			new Employ(1, "Anvesh", 99423),
			new Employ(2, "Prasanth", 88422),
			new Employ(3, "Venky", 88233),
			new Employ(4, "Hemanth", 66134),
		};
		return names;
	}
	public static void main(String[] args) {
		Employ[] res = new EmpArray().show();
		for (Employ employ : res) {
			System.out.println(employ);
		}
	}
}
