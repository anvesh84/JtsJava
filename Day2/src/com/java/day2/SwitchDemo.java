package com.java.day2;

public class SwitchDemo {
	public void show(int dayNo) {
		switch(dayNo) {
		case 1 : 
			System.out.println("Its Sunday...");
			break;
		case 2 :
			System.out.println("Its Monday...");
			break;
		case 3 : 
			System.out.println("Its Tuesday...");
			break;
		case 4 : 
			System.out.println("Its Wednesday...");
			break;
		case 5 : 
			System.out.println("Its Thursday...");
			break;
		case 6 : 
			System.out.println("Its Friday...");
			break;
		case 7 : 
			System.out.println("Its Saturday...");
			break;
		default : 
			System.out.println("Invalid Value...");
			break;
		}
	}
	public static void main(String[] args) {
		int dayNo=3;
		new SwitchDemo().show(dayNo);
	}
}
