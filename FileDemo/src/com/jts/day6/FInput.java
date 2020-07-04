package com.jts.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:/Java_Jignasa/Day5/ExDemo/src/com/jts/day5/ArrEx.java");
			int ch;
			while((ch=fin.read()) != -1) {
				System.out.print((char)ch);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
