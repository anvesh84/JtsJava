package com.jts.col;

import java.util.ArrayList;
import java.util.List;

public class ArrEmployEx {
	public static void main(String[] args) {
		List lstEmploy = new ArrayList();
		lstEmploy.add(new Employ(1, "Hemanth", 88234));
		lstEmploy.add(new Employ(3, "Prasanth", 66722));
		lstEmploy.add(new Employ(4, "Venky", 56744));
		lstEmploy.add(new Employ(5, "Anvesh", 78994));
		for (Object ob : lstEmploy) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
