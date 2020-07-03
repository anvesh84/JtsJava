package com.jts.day5;

public class ThrEx {
	public void show(int n) {
		if (n < 0) {
			throw new ArithmeticException("Negative No Not Allowed...");
		} else if (n == 0) {
			throw new NumberFormatException("Zero is invalid value...");
		} else {
			System.out.println("N value is  " + n);
		}
	}
	public static void main(String[] args) {
		int n=3;
		try {
			new ThrEx().show(n);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
