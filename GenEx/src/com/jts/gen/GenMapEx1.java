package com.jts.gen;

import java.util.HashMap;
import java.util.Map;

public class GenMapEx1 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Anvesh");
		m.put(2, "Hemanth");
		m.put(3, "Prasanth");
		m.put(4, "Venky");
		int key = 2;
		String res = m.getOrDefault(key, "Not Found");
		System.out.println(res);
	}
}
