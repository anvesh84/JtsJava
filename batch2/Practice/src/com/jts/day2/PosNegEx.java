package com.jts.day2;

public class PosNegEx {
	
	public void check(int n) {
		if (n >= 0) {
			System.out.println("Positive Number...");
		} else {
			System.out.println("Negative Number...");
		}
	}
	public static void main(String[] args) {
		int n=-5;
		PosNegEx obj = new PosNegEx();
		obj.check(n);
	}
}
