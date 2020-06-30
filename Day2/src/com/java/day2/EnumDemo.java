package com.java.day2;

enum WeekDays {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}

public class EnumDemo {
	public static void main(String[] args) {
		WeekDays wd = WeekDays.WEDNESDAY;
		System.out.println(wd);
		String str =String.valueOf(wd);
		System.out.println(str);
	}
}
