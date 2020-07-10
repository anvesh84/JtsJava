package com.jts.gen;

interface IHello {
	void show();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		IHello obj1 = () -> {
			System.out.println("Welcome to Lambda Expressions...");
		};
		IHello obj2 = () -> {
			System.out.println("Have Nice Day...");
		};
		
		obj1.show();
		obj2.show();
	}
}
