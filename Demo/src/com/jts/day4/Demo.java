package com.jts.day4;

class Test {
	public void show() {
		System.out.println("Show from Test Class...");
	}
	public static void display() {
		System.out.println("Display From Class Test...");
	}
}
public class Demo {
	public static void main(String[] args) {
		Test.display();
		new Test().show();
	}
}
