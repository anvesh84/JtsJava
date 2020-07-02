package com.jts.sup;

class Employ {
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

class Anvesh extends Employ {
	public Anvesh(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}
class Prasanth extends Employ {
	public Prasanth(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}
public class SupEmploy {
	public static void main(String[] args) {
		Employ e1 = new Anvesh(1, "Anvesh", 88234);
		Employ e2 = new Prasanth(3, "Prasanth", 92455);
		System.out.println(e1);
		System.out.println(e2);
	}
}
