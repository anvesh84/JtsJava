package com.java.day3;

public class Demo {
    static {
    	System.out.println("Static Constructor...");
    }
    Demo() {
    	System.out.println("Instance Constructor...");
    }
    public static void main(String[] args) {
		new Demo();
	}
}
