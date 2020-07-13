package com.jts.day2;

public class OverloadEx {

	public void show(int x) {
		System.out.println("Show w.r.t. Integer  " +x);
	}
	
	public void show(double x) {
		System.out.println("Show w.r.t. Double  " +x);
	}
	
	public void show(String x) {
		System.out.println("Show w.r.t. String  " +x);
	}
	
	public static void main(String[] args) {
		OverloadEx obj = new OverloadEx();
		obj.show(12);
		obj.show(12.5);
		obj.show("Java");
	}
}
