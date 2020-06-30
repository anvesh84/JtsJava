package com.java.day2;

public class EnumEx {
	public void show(String accType) {
		Accounts acc=Accounts.CURRENT;
		switch(accType.toUpperCase()) {
		case "SAVINGS" :
			acc=Accounts.SAVINGS;
			break;
		case "CURRENT" :
			acc=Accounts.CURRENT;
			break;
		case "RECURRING" :
			acc=Accounts.RECURRING;
			break;
		default : 
			acc = null;
			break;
		}
		System.out.println("Type is  " +acc);
	}
	public static void main(String[] args) {
		String accType="current";
		new EnumEx().show(accType);
	}
}
