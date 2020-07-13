package com.jts.day2;

public class OverloadTest {
	
	public int sum() {
		return 5;
	}
	
	public int sum(int x) {
		return x+5;
	}
	
	public int sum(int x,int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		OverloadTest obj = new OverloadTest();
		System.out.println("Sum w.r.t. Zero Args  " +obj.sum());
		System.out.println("Sum w.r.t. One Arg    " +obj.sum(52));
		System.out.println("Sum w.r.t. Two Args   " +obj.sum(25, 13));
	}
}
