package com.jts.col;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHset {
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add("Hemanth");
		s.add("Prasanth");
		s.add("Venky");
		s.add("Anvesh");
		s.add("Hemanth");
		s.add("Prasanth");
		s.add("Venky");
		s.add("Hemanth");
		s.add("Prasanth");
		s.add("Venky");
		s.add("Prasanth");
		s.add("Venky");
		s.add("Anvesh");
		s.add("Prasanth");
		s.add("Venky");
		s.add("Anvesh");
		System.out.println("Data  ");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
}
