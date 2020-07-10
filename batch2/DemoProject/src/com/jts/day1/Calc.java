package com.jts.day1;

public class Calc {
	
	public void sum(int a, int b) {
		int c = a+b;
		System.out.println("Sum is  " +c);
	}
	public static void main(String[] args) {
		int a=12;
		int b=7;
		Calc obj = new Calc();
		obj.sum(a, b);
	}
}
