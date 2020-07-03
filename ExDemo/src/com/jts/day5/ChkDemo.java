package com.jts.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChkDemo {
	public void showFile() throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("d:/hello.txt");
	}
	public static void main(String[] args) {
		try {
			new ChkDemo().showFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
