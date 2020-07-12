package com.jts.day2;

public class EvenOddEx {
	
	public void check(int n) {
		if (n%2==0) {
			System.out.println("Even Number...");
		} else {
			System.out.println("Odd Number...");
		}
	}
	public static void main(String[] args) {
		int n = 4;
		EvenOddEx obj = new EvenOddEx();
		obj.check(n);
	}
}
