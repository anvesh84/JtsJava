package com.java.day2;

public class StrEx {
	public void show() {
		String str = "Welcome to Java Programming...";
		System.out.println("Length of String is " +str.length());
		System.out.println(str.charAt(5));
		System.out.println("Index of 'a' " +str.indexOf('a'));
		String str1 = "Anvesh";
		String str2 = "Hemanth";
		String str3 = "Anvesh";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str.replace("Java", "J2EE"));
		String demo = "Anvesh,Hemanth,Prasanth,Venky";
		String[] names = demo.split(",");
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		new StrEx().show();
	}
}
