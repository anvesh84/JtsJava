package com.jts.gen;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx3 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Venky");
		names.add("Anvesh");
		names.add("Hemanth");
		names.add("Prasanth");
		names.add("Naveen");
		names.forEach( (i) -> {
			System.out.println(i);
		});
	}
}
