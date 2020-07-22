package com.jts.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("e:/java/data.txt");
			DataInputStream din = new DataInputStream(fin);
			System.out.println(din.readInt());
			System.out.println(din.readUTF());
			System.out.println(din.readDouble());
			System.out.println(din.readBoolean());
			din.close();
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
