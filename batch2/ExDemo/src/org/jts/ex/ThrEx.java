package org.jts.ex;

public class ThrEx {
	
	public void show(int n) {
		if (n < 0) {
			throw new ArithmeticException("Negative Nos Not Allowed...");
		} else if (n == 0) {
			throw new NumberFormatException("Zero is Invalid...");
		} else {
			System.out.println("N value  " +n);
		}
	}
	public static void main(String[] args) {
		int n=5;
		ThrEx obj = new ThrEx();
		try {
			obj.show(n);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
