package com.java.day3;

public class VarArgsDemo {
	public void show(String...name) {
		for (String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VarArgsDemo obj = new VarArgsDemo();
		obj.show();
		obj.show("Anvesh","Venky");
		obj.show("Anvesh","Prasanth","Venky");
		obj.show("Anvesh","Prasanth","Venky","Hemanth");
	}
}
