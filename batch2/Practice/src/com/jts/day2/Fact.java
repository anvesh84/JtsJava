package com.jts.day2;

public class Fact {
	public void calc(int n) {
		int f=1;
		int i=1;
		while(i <= n) {
			f = f*i;
			i++;
		}
		System.out.println("Factorial Value   " +f);
	}
	public static void main(String[] args) {
		int n=7;
		Fact obj = new Fact();
		obj.calc(n);
	}
}
