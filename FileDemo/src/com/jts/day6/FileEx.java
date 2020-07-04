package com.jts.day6;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File f1 = new File("C:/Java_Jignasa/Day5/ExDemo/src/com/jts/day5/ArrEx.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("File Path  " +f1.getPath());
		System.out.println("Parent Directory  " +f1.getParent());
		File f2 = new File("C:/Java_Jignasa/Day5/ExDemo/src/com/jts/day5");
		String[] flist=f2.list();
		for (String s : flist) {
			System.out.println(s);
		}
	}
}
