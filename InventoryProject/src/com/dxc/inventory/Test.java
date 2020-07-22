package com.dxc.inventory;

import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(new StockDAO().generateOrderId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
