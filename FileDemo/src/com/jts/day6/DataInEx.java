package com.jts.day6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("e:/ang/data.txt");
			DataInputStream din=new DataInputStream(fin);
			System.out.println("X value  " +din.readInt());
			System.out.println("String Value  " +din.readUTF());
			System.out.println("Double Value  " +din.readDouble());
			System.out.println("Boolean Value  " +din.readBoolean());
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
