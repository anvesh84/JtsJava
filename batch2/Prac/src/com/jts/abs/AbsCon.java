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

class SaiNaveen extends Employ {
	public SaiNaveen(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Prasanna extends Employ {
	public Prasanna(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

public class AbsCon {
	public static void main(String[] args) {
//		Employ e1 = new SaiNaveen(1, "SaiNaveen", 66322);
//		Employ e2 = new Prasanna(3, "Prasanna", 63425);
		Employ[] arr = new Employ[] {
			new SaiNaveen(1, "SaiNaveen", 66322),
			new Prasanna(3, "Prasanna", 63425)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
