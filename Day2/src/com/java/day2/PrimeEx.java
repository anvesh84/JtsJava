package com.java.day2;

public class PrimeEx {
	public void check(int n) {
		boolean flag = true;
		int i = 2;
		while (i < n) {
			if (n%i==0) {
				flag=false;
			}
			i++;
		}
		if (flag==true) {
			System.out.println("Prime Number...");
		} else {
			System.out.println("Not Prime...");
		}
	}
	public static void main(String[] args) {
		int n = 6;
		new PrimeEx().check(n);
	}
}
