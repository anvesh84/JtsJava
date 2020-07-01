package com.java.day3;

public class BoxingDemo {
	public static void main(String[] args) {
		int a=12;
		double b=12.6;
		String str="Hello";
		
		/* Boxing Demo */ 
		Object ob1=a;
		Object ob2=b;
		Object ob3=str;
		
		/* Unboxing Demo */ 
		int a1 = (Integer)ob1;
		double b1 = (Double)ob2;
		String s1 = (String)ob3;
		
		System.out.println("A1 value " +a1);
		System.out.println("B1 value  " +b1);
		System.out.println("Name  " +s1);
	}
}
