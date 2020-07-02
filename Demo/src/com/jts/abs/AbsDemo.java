package com.jts.abs;

abstract class Training {
	public abstract void name();
	public abstract void email();
}

class Anvesh extends Training {
	@Override
	public void name() {
		System.out.println("Name is Anvesh...");
	}

	@Override
	public void email() {
		System.out.println("Email is Anvesh@gmail.com");
	}
}

class Hemanth extends Training {

	@Override
	public void name() {
		System.out.println("Name is Hemanth...");
	}

	@Override
	public void email() {
		System.out.println("Email hemanth@gmail.com");
	}
}

class Prasanth extends Training {

	@Override
	public void name() {
		System.out.println("Name is Prasanth...");
	}

	@Override
	public void email() {
		System.out.println("Email is prasanth@gmail.com");
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
//		Training obj1 = new Anvesh();
//		Training obj2 = new Hemanth();
//		Training obj3 = new Prasanth();
		Training[] arr = new Training[] {
			new Anvesh(),
			new Hemanth(),
			new Prasanth()
		};
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
