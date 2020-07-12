package com.jts.day2;

public class StrEx {
	public void show() {
		String str = "Welcome to Java Programming...";
		System.out.println("Length of String is  " +str.length());
		System.out.println("First Char Index of 'a' is  " +str.indexOf("a"));
		System.out.println("First Char Index of 'z' is  " +str.indexOf("z"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("Lower Case String  " +str.toLowerCase());
		System.out.println("Upper Case String  " +str.toUpperCase());
		String str1 = "Hello", str2 = "Hello";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str.replace("Java", "J2EE"));
		System.out.println(str.substring(2, 8));
	}
	public static void main(String[] args) {
		StrEx obj = new StrEx();
		obj.show();
	}
}
