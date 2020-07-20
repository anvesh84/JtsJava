package com.jts.intf;

interface ITraining {
	void name();
	void email();
}

class SaiNaveen implements ITraining {
	@Override
	public void name() {
		System.out.println("Name is SaiNaveen...");
	}

	@Override
	public void email() {
		System.out.println("Email is sainaveen@gmail.com");
	}
}

class Raju implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Raju...");
	}

	@Override
	public void email() {
		System.out.println("Email is raju@gmail.com");
	}
	
}
public class IntfEx {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new SaiNaveen(), new Raju()	
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
