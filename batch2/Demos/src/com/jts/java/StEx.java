package com.jts.java;

public class StEx {
	
	public static void display() {
		System.out.println("From Display Method...");
	}
	
	void show() {
		System.out.println("From Show Method...");
	}
	
	public static void main(String[] args) {
		StEx.display();
		StEx obj = new StEx();
		obj.show();
	}
}
