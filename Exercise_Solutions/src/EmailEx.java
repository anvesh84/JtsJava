
class InvalidEmailException extends Exception {
	public InvalidEmailException(String error) {
		super(error);
	}
}

class InvalidUserException extends Exception {
	public InvalidUserException(String error) {
		super(error);
	}
}
public class EmailEx {
	public void check(String email) throws InvalidEmailException, InvalidUserException {
		if (email.indexOf("@") == -1) {
			throw new InvalidEmailException("@ not found...");
		} else if (email.indexOf("@") > 12) {
			throw new InvalidUserException("Invalid User...");
		} else {
			System.out.println(email);
		}
	}
	public static void main(String[] args) {
		String email="anvesh@gmail.com";
		EmailEx obj = new EmailEx();
		try {
			obj.check(email);
		} catch (InvalidEmailException | InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
