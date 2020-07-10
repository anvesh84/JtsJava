package com.jts.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> employs = new ArrayList<Employ>();
		employs.add(new Employ(1, "Hemanth", 88234));
		employs.add(new Employ(3, "Prasanth", 66722));
		employs.add(new Employ(4, "Venky", 56744));
		employs.add(new Employ(5, "Anvesh", 78994));
		System.out.println("Employ List  ");
		for (Employ e : employs) {
			System.out.println(e);
		}
	}
}
