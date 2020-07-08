package com.jts.col;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
	public static void main(String[] args) {
		List lstNum = new ArrayList();
		lstNum.add(new Integer(45));
		lstNum.add(new Integer(63));
		lstNum.add(new Integer(11));
		lstNum.add(new Integer(67));
		int sum=0;
		for (Object ob : lstNum) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum is  " +sum);
	}
}
