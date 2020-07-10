package com.jts.day1;

class Data {
	
	public void sayHello() {
		System.out.println("Welcome to Java Programming...");
	}
	
	void topic() {
		System.out.println("Day 1 Java Programming...");
	}
	
	private void lunch() {
		System.out.println("Lunch at 1 PM IST...");
	}
}
public class Demo {
	
	public static void main(String[] args) {
		Data obj = new Data();
		obj.sayHello();
		obj.topic();
	}
}
