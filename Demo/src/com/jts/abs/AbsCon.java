package com.jts.abs;

abstract class Employ {
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Venky extends Employ {
	public Venky(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Surya extends Employ {
	public Surya(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

public class AbsCon {
	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Venky(1, "Venky", 88244),
			new Surya(3, "Surya", 82355)
		};
		for (Employ e : arr) {
			System.out.println(e);
		}
	}
}
