package com.jts.day5;

class VotingException extends Exception {
	VotingException(String error) {
		super(error);
	}
}
public class Voting {
	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not elligible for voting...");
		} else {
			System.out.println("You are elligible for voting...");
		}
	}
	public static void main(String[] args) {
		int age=21;
		try {
			new Voting().check(age);
		} catch (VotingException e) {
			e.printStackTrace();
		}
	}
}
