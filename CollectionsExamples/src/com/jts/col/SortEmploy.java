package com.jts.col;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		// Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet s = new TreeSet(c);
		s.add(new Employ(1, "Prasanth", 88234.44));
		s.add(new Employ(2, "Venky", 81234.44));
		s.add(new Employ(3, "Hemanth", 83234.44));
		s.add(new Employ(4, "Anvesh", 98234.44));
		s.add(new Employ(5, "Surya", 85234.44));
		for (Object ob : s) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
