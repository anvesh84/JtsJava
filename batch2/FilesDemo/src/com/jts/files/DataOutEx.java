package com.jts.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("e:/java/data.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(56);
			dout.writeUTF("Welcome");
			dout.writeDouble(88234.55);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("*** File Created ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
