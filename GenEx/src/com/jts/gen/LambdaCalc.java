package com.jts.gen;

interface IOperations {
	int calc(int x,int y); 
}

public class LambdaCalc {
	public static void main(String[] args) {
		IOperations obj1 = (a,b) -> {
			return a+b;
		};
		
		IOperations obj2 = (a,b) -> {
			return a-b;
		};
		
		IOperations obj3 = (a,b) -> {
			return a*b;
		};
		
		System.out.println(obj1.calc(12, 5));
		System.out.println(obj2.calc(12, 5));
		System.out.println(obj3.calc(12, 5));
	}
}
