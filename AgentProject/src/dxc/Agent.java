package dxc;

import java.io.Serializable;

public class Agent implements Serializable {
	int Id;
	String FirstName;
	String LastName;
	String Gender;
	int PayMode;
	double AnnualPremium;
	public Agent() {
		super();
		}
	public Agent(int id, String firstName, String lastName, String gender, int payMode, double annualPremium) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
		PayMode = payMode;
		AnnualPremium = annualPremium;
	}
	@Override
	public String toString() {
		return "Agent [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender
				+ ", PayMode=" + PayMode + ", AnnualPremium=" + AnnualPremium + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getPayMode() {
		return PayMode;
	}
	public void setPayMode(int payMode) {
		PayMode = payMode;
	}
	public double getAnnualPremium() {
		return AnnualPremium;
	}
	public void setAnnualPremium(double annualPremium) {
		AnnualPremium = annualPremium;
	}




}

