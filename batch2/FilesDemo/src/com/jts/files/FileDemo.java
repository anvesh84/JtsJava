package com.jts.files;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f1 = new File("C:/Java_Jignasa_B2/Day2/ExDemo/src/org/jts/ex/ArrEx.java");
		System.out.println("File Name   " +f1.getName());
		System.out.println("Path  " +f1.getPath());
		System.out.println("Parent Directory  " +f1.getParent());
		
		File f2 = new File("C:/Java_Jignasa_B2/Day2/ExDemo/src/org/jts/ex");
		String[] flist = f2.list();
		for (String s : flist) {
			System.out.println(s);
		}
	}
}
