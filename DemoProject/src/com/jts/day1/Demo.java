package com.jts.day1;

class Data {
	public void sayHello() {
		System.out.println("Welcome to Java...");
	}
	private void logout() {
		System.out.println("Logout by 10 PM...");
	}
	void topic() {
		System.out.println("Java Introduction...");
	}
}
public class Demo {
	public static void main(String[] args) {
		Data obj = new Data();
		obj.sayHello();
		obj.topic();
	}
}
