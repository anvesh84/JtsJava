package com.jts.col;

import java.util.LinkedList;

public class LinkEx {
	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("SaiKumar");
		names.add("SaiNaveen");
		names.add("Sumanth");
		names.add("Prasanna");
		System.out.println("List of Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.addFirst("Krishna");
		names.addLast("Himani");
		System.out.println("Names after Update  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
