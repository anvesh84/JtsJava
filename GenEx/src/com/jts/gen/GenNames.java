package com.jts.gen;

import java.util.ArrayList;
import java.util.List;

public class GenNames {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Venky");
		names.add("Anvesh");
		names.add("Hemanth");
		names.add("Prasanth");
		names.add("Naveen");
//		for (String s : names) {
//			System.out.println(s);
//		}
		names.forEach(System.out::println);
	}
}
