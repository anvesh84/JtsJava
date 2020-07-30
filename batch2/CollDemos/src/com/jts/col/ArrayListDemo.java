package com.jts.col;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("SaiKumar");
		names.add("SaiNaveen");
		names.add("Sumanth");
		names.add("Prasanna");
		
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(2, "Anvesh");
		System.out.println("Names after Adding New Name");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(0, "Dasaraju");
		System.out.println("Names after Editing   ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove(1);
		System.out.println("Names after removing object ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Sumanth");
		System.out.println("Names after removing by object name ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
