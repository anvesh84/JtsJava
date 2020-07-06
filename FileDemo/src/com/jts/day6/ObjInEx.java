package com.jts.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjInEx {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("e:/ang/test.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			String str=(String)objin.readObject();
			Date dt = (Date)objin.readObject();
			System.out.println(str+dt);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
