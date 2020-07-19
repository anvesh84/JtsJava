package com.jts.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		System.out.println("Enter First Name  ");
		account.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name  ");
		account.setLastName(sc.nextLine());
		System.out.println("Enter City   ");
		account.setCity(sc.nextLine());
		System.out.println("Enter State   ");
		account.setState(sc.nextLine());
		System.out.println("Enter Amount   ");
		account.setAmount(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter CheqFacil   ");
		account.setCheqFacil(sc.nextLine());
		System.out.println("Enter AccountType   ");
		account.setAccountType(sc.nextLine());
		AccountDAO dao = new AccountDAO();
		try {
			System.out.println(dao.generateAccountNo());
			int accno =dao.generateAccountNo();
			account.setAccountNo(accno);
			System.out.println(dao.createAccount(account));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
