package com.jts.intf;

interface IOne {
	void name();
}
interface ITwo {
	void email();
}

class Demo implements IOne,ITwo {

	@Override
	public void email() {
		System.out.println("jignasa@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Java Training going on");
	}
	
}
public class MultiInh {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.name();
		obj.email();
	}
}
