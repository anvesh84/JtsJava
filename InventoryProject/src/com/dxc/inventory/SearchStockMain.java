package com.dxc.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchStockMain {
	public static void main(String[] args) {
		String stockId;
		System.out.println("Enter Stock Id ");
		Scanner sc = new Scanner(System.in);
		stockId = sc.nextLine();
		try {
			Stock stock = new StockDAO().searchStock(stockId);
			System.out.println(stock);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
