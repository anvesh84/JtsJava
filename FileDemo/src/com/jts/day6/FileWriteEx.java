package com.jts.day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
	public static void main(String[] args) {
		File src = new File("C:/Java_Jignasa/Day5/ExDemo/src/com/jts/day5/ArrEx.java");
		File tar = new File("e:/ang/ArrEx.java");
		FileReader fr = null;
		FileWriter fw = null;
		int ch;
		try {
			fr = new FileReader(src);
			fw = new FileWriter(tar);
			while((ch=fr.read()) != -1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
