package com.java.day3;

class Test {
	int a,b;
	public Test() {
		a=5;
		b=7;
	}
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
}
public class ConTest {
	public static void main(String[] args) {
		Test obj1 = new Test();
		System.out.println(obj1);
		Test obj2 = new Test(89, 42);
		System.out.println(obj2);
	}
}
