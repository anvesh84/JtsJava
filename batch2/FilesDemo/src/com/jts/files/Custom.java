package com.jts.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom {
	public static void main(String[] args) {
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name   ");
		try {
			name = br.readLine();
			System.out.println("Name is  " +name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
