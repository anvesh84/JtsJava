package org.jts.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExample {
	
	public void readFile() throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("d:/hello.txt");
	}
	public static void main(String[] args) {
		FileExample obj = new FileExample();
		try {
			obj.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
