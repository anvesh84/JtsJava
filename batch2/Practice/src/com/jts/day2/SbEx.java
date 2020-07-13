package com.jts.day2;

public class SbEx {
	public void show() {
		StringBuilder sb = new StringBuilder("Welcome to Java Programming...");
		System.out.println(sb);
		sb.append("Trainer Prasanna");
		System.out.println(sb);
		sb.insert(3, "Jignyasa Technologies");
		System.out.println(sb);
		sb.delete(3, 8);
		System.out.println(sb);
	}
	public static void main(String[] args) {
		SbEx obj = new SbEx();
		obj.show();
	}
}
