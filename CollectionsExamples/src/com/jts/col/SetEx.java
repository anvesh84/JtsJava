package com.jts.col;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set s = new HashSet();
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
