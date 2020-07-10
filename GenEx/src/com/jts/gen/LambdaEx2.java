package com.jts.gen;

interface ITest {
	String greeting();
}
public class LambdaEx2 {
	public static void main(String[] args) {
		ITest obj1 = () -> {
			return "Good Morning...";
		};
		ITest obj2 = () -> {
			return "Good Evening...";
		};
		
		System.out.println(obj1.greeting());
		System.out.println(obj2.greeting());
	}
}
