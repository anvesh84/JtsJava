package com.jts.col;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEx {
	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Venky");
		names.add("Hemanth");
		names.add("Anvesh");
		names.add("Surya");
		names.add("Prasanth");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
