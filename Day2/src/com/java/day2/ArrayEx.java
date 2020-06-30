package com.java.day2;

public class ArrayEx {
	public void show() {
		int[] a = new int[] {5,33,67,9,62};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new ArrayEx().show();
	}
}
