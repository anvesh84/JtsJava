package com.jts.sup;

class C1 {
	int a,b;
	public C1(int a, int b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		return "C1 [a=" + a + ", b=" + b + "]";
	}
}

class C2 extends C1 {
	public C2(int a, int b) {
		super(a, b);
	}
}
public class SupCon {
	public static void main(String[] args) {
		C2 obj = new C2(12, 5);
		System.out.println(obj);
	}
}
