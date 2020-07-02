package com.jts.abs;

abstract class Animal {
	public abstract void name();
	public abstract void type();
}

class Lion extends Animal {
	@Override
	public void name() {
		System.out.println("Name is Lion...");
	}
	@Override
	public void type() {
		System.out.println("Its Wild Animal...");
	}
}

class Crocodile extends Animal {

	@Override
	public void name() {
		System.out.println("Name is Crocodile...");
	}

	@Override
	public void type() {
		System.out.println("Its water Animal...");
	}
}
public class AbsEx {
	public static void main(String[] args) {
		Animal[] arr = new Animal[] {
			new Lion(),
			new Crocodile()
		};
		for (Animal a : arr) {
			a.name();
			a.type();
		}
	}
}
