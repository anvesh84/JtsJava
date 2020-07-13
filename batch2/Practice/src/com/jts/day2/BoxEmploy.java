package com.jts.day2;

public class BoxEmploy {
	
	public void show(Object ob) {
		Employ e = (Employ)ob;
		System.out.println(e);
	}
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno=1;
		employ.name="SaiNaveen";
		employ.basic=82345;
		BoxEmploy obj = new BoxEmploy();
		obj.show(employ);
	}
}
