package com.jts.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {
	
	public void readFile() throws IOException {
		File f1 = new File("C:/Java_Jignasa_B2/Day2/ExDemo/src/org/jts/ex/ArrEx.java");
		FileReader fr=new FileReader(f1);
		int ch;
		while((ch=fr.read()) != -1) {
			System.out.print((char)ch);
		}
		fr.close();
	}
	public static void main(String[] args) {
		 try {
			new FileReadEx().readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
