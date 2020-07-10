package com.jts.day1;

public class CircleDemo {
	public void calc(double radius) {
		double area = 3.14 * radius * radius;
		double circ = 2 * 3.14 * radius;
		System.out.println("Area of Circle  " +area);
		System.out.println("Circumference   " +circ);
	}
	public static void main(String[] args) {
		double radius=8.6;
		CircleDemo obj = new CircleDemo();
		obj.calc(radius);
	}
}
