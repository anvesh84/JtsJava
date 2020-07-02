package com.jts.intf;

interface ITraining {
	void name();
	void email();
}

class Venky implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Venky...");
	}

	@Override
	public void email() {
		System.out.println("Email venky@gmail.com");
	}
	
}
class Anvesh implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Anvesh...");
	}

	@Override
	public void email() {
		System.out.println("Email anvesh@gmail.com");
	}
}

public class IntfEx {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Anvesh(),
			new Venky()
		};
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
