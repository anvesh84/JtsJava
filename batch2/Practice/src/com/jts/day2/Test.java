package com.jts.day2;

import java.util.Scanner;

public class Test {
	
	public void show() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter Name   ");
		name=sc.nextLine();
		if (name.indexOf(" ") != -1) {
			System.out.println("Invalid Name");
		} else {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		new Test().show();
	}
}
