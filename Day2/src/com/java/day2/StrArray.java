package com.java.day2;

public class StrArray {
	public void show() {
		String[] names = new String[] {"Anvesh",
				"Hemanth","Prasanth","Venky"};
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		new StrArray().show();
	}
}
