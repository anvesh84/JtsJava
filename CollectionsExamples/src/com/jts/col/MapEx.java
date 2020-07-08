package com.jts.col;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("1", "Prasanth");
		m.put("2", "Hemanth");
		m.put("3", "Venky");
		m.put("4", "Anvesh");
		String res = (String)m.getOrDefault("10", "Not Found");
		System.out.println(res);
	}
}
