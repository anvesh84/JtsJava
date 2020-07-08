package com.jts.col;

import java.util.Hashtable;
import java.util.Map;

public class MapTab {
	public static void main(String[] args) {
		Map m = new Hashtable();
		m.put("Anvesh", 88434.55);
		m.put("Hemanth", 81234.56);
		m.put("Prasanth", 82455.66);
		m.put("Venky", 81666.44);
		double res = (Double)m.getOrDefault("Hemanth", 0.0);
		System.out.println(res);
	}
}
