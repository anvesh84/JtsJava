package com.jts.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Raju extends Training {

	@Override
	void name() {
		System.out.println("Name is Raju...");
	}

	@Override
	void email() {
		System.out.println("Email is Raju@gmail.com");
	}
}

class Naveen extends Training {

	@Override
	void name() {
		System.out.println("Name is Naveen...");
	}

	@Override
	void email() {
		System.out.println("Email is Naveen@gmail.com");
	}
}

class Sumanth extends Training {

	@Override
	void name() {
		System.out.println("Name is Sumanth...");
	}

	@Override
	void email() {
		System.out.println("Email is Sumanth@gmail.com");
	}
	
}

public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Raju(),
			new Naveen(),
			new Sumanth()
		};
		
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
