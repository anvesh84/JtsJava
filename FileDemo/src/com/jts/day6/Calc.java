package com.jts.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calc {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter 2 Numbers   ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c=a+b;
			System.out.println("Sum is   " +c);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
