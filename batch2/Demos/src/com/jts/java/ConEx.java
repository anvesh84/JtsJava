package com.jts.java;

public class ConEx {
	static {
		System.out.println("Welcome to Java Programming...");
	}
	
	ConEx() {
		System.out.println("Default Constructor...");
	}
	
	public static void main(String[] args) {
		ConEx obj = new ConEx();
	}
}
