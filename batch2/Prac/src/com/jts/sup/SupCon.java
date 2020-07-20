package com.jts.sup;

class Employ {
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Naveen extends Employ {

	public Naveen(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
}

class Sumanth extends Employ {

	public Sumanth(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
}
public class SupCon {
	public static void main(String[] args) {
		Employ emp1 = new Naveen(1, "Naveen", 88445);
		Employ emp2 = new Sumanth(3, "Sumanth", 83456);
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
