package com.jts.col;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		List lstNames = new ArrayList();
		lstNames.add("Anvesh");
		lstNames.add("Hemanth");
		lstNames.add("Venky");
		lstNames.add("Prasanth");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
		lstNames.add(2, "Narayani");
		System.out.println("List after Adding new Item");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
		lstNames.set(1, "Surya");
		System.out.println("List after Modify ");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
		lstNames.remove(0);
		System.out.println("List after removing by Index...");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
		lstNames.remove("Narayani");
		System.out.println("List after removing by object Name");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
	}
}
