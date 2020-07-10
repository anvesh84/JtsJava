package com.jts.gen;

class Data<T> {
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value  " +a);
		System.out.println("B value  " +b);
	}
}
public class SwapEx {
	public static void main(String[] args) {
		Data obj = new Data();
		int a=12, b =7;
		obj.swap(a, b);
		String s1="Anvesh", s2="Hemanth";
		obj.swap(s1, s2);
		double b1=12.5, b2=6.4;
		obj.swap(b1, b2);
	}
}
