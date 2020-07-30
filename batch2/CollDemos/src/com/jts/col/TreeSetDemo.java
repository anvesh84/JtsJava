package com.jts.col;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		SortedSet s = new TreeSet(); 
		s.add("Prashanth");
		s.add("Anvesh");
		s.add("Hemanth");
		s.add("Prasanna");
		s.add("Naveen");
		s.add("Dasaraju");
		
		System.out.println("Names are  ");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
}
