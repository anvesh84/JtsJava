package org.jts.ex;

class VotingException extends Exception {
	public VotingException(String error) {
		super(error);
	}
}

public class Voting {
	
	public void check(int n) throws VotingException {
		if (n < 18) {
			throw new VotingException("You are not authorized for voting...");
		} else {
			System.out.println("You can Vote...");
		}
	}
	public static void main(String[] args) {
		int n=17;
		Voting obj = new Voting();
		try {
			obj.check(n);
		} catch (VotingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
