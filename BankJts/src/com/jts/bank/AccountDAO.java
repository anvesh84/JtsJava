package com.jts.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public String withdrawAccount(int accountNo, int withdrawAmount) throws SQLException {
		connection = ConnectionHelper.getConnection();
		Account account = searchAccount(accountNo);
		if (account != null) {
			int amount = account.getAmount();
			if (amount - withdrawAmount >= 1000) {
				String cmd = "UPDATE Account SET Amount = Amount-? WHERE AccountNo=?";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, withdrawAmount);
				pst.setInt(2, accountNo);
				pst.executeUpdate();
				cmd = "INSERT INTO accounttransaction(AccountNo,TranAmount,TranType) values(?, ?, ?)";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setInt(2, withdrawAmount);
				pst.setString(3, "D");
				pst.executeUpdate();
				return "Amount Debited...";
				
			} else {
				return "Insufficient Funds...";
			}
		} else {
			return "AccountNo Not found...";
		}
	}
	public String depositAccount(int accountNo, int depositAmount) throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "UPDATE ACCOUNT SET Amount=Amount+? WHERE AccountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, depositAmount);
		pst.setInt(2, accountNo);
		pst.executeUpdate();
		cmd = "INSERT INTO accounttransaction(AccountNo,TranAmount,TranType) values(?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setInt(2, depositAmount);
		pst.setString(3, "C");
		pst.executeUpdate();
		return "Amount Credited...";
	}
	public String closeAccount(int accountNo) throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "UPDATE ACCOUNT SET Status='inactive' WHERE ACCOUNTNO=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.executeUpdate();
		return "Account Closed...";
	}
	public String updateAccount(int accoutNo, String city, String state) throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Update Account SET City=?, State=? Where AccountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, city);
		pst.setString(2, state);
		pst.setInt(3, accoutNo);
		pst.executeUpdate();
		return "Account Updated...";
	}
	
	public Account searchAccount(int accountNo) throws SQLException {
		connection = ConnectionHelper.getConnection();
		Account account = null;
		String cmd = "select * from Account Where AccountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			account = new Account();
			account.setAccountNo(accountNo);
			account.setFirstName(rs.getString("firstname"));
			account.setLastName(rs.getString("lastName"));
			account.setCity(rs.getString("city"));
			account.setState(rs.getString("state"));
			account.setAmount(rs.getInt("amount"));
			account.setCheqFacil(rs.getString("CheqFacil"));
			account.setAccountType(rs.getString("accountType"));
		}
		return account;
	}
	
	public String createAccount(Account account) {
		String cmd = "INSERT INTO ACCOUNT(AccountNo,FirstName,LastName,"
				+ "City,State,Amount,CheqFacil,AccountType) VALUES(?, ?,"
				+ "?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		String result = "";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, account.getAccountNo());
			pst.setString(2, account.getFirstName());
			pst.setString(3, account.getLastName());
			pst.setString(4, account.getCity());
			pst.setString(5, account.getState());
			pst.setInt(6, account.getAmount());
			pst.setString(7, account.getCheqFacil());
			pst.setInt(8, account.getAmount());
			pst.executeUpdate();
			result = "Account Created Successfully...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	
	public int generateAccountNo() throws SQLException {
		String cmd = "SELECT CASE WHEN MAX(ACCOUNTNO) IS NULL THEN 1 "
				+ " ELSE MAX(ACCOUNTNO)+1 END accno FROM ACCOUNT";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
}
