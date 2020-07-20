package com.jts.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Sumanth implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is sumanth@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Sumanth...");
	}
	
}
public class MultiInh {
	public static void main(String[] args) {
		Sumanth obj = new Sumanth();
		obj.name();
		obj.email();
	}
}
