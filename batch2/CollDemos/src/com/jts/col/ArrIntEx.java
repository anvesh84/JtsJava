package com.jts.col;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
	
	public static void main(String[] args) {
		List numbers = new ArrayList();
		numbers.add(new Integer(24));
		numbers.add(new Integer(11));
		numbers.add(new Integer(35));
		numbers.add(new Integer(9));
		int sum=0;
		for (Object ob : numbers) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum is   " +sum);
	}
}
