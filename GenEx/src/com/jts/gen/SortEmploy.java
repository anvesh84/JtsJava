package com.jts.gen;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		SortedSet<Employ> names = new TreeSet<Employ>(new NameComparator());
		names.add(new Employ(1, "Prasanth", 88234.44));
		names.add(new Employ(2, "Venky", 81234.44));
		names.add(new Employ(3, "Hemanth", 83234.44));
		names.add(new Employ(4, "Anvesh", 98234.44));
		names.add(new Employ(5, "Surya", 85234.44));
		
		for (Employ employ : names) {
			System.out.println(employ);
		}
	}
}
