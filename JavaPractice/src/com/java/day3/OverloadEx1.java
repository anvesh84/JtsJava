package com.java.day3;

public class OverloadEx1 {
	public void show(int x) {
		System.out.println("Show w.r.t. Integer " +x);
	}
	public void show(double x) {
		System.out.println("Show w.r.t. Double " +x);
	}
	public void show(String x) {
		System.out.println("Show w.r.t. String " +x);
	}
	public static void main(String[] args) {
		OverloadEx1 obj = new OverloadEx1();
		obj.show(12);
		obj.show(12.7);
		obj.show("Welcome");
	}
}
