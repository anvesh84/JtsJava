package com.java.day2;

public class Perfect {
	public void check(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if (n%i==0) {
				sum +=i;
			}
		}
		if(sum == n) {
			System.out.println("Perfect Number...");
		} else {
			System.out.println("Not Perfect Number...");
		}
	}
	public static void main(String[] args) {
		int n = 10;
		new Perfect().check(n);
	}
}
