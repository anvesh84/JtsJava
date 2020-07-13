package com.jts.day2;

public class BoxEx {
	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String name="Welcome";
		
		/* Boxing Example */ 
		Object ob1=x;
		Object ob2=y;
		Object ob3=name;
		
		/* Unboxing Example */ 
		
		int x1 = (Integer)ob1;
		double y1 = (Double)ob2;
		String str = (String)ob3;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(str);
	}
}
