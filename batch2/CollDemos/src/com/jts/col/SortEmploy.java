package com.jts.col;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
//		Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "SaiKumar", 88234));
		employs.add(new Employ(2, "SaiNaveen", 92344));
		employs.add(new Employ(3, "Prasanna", 89224));
		employs.add(new Employ(4, "Sumanth", 90344));
		System.out.println("Employees are  ");
		for (Object ob : employs) {
			System.out.println(ob);
		}
	}
}
