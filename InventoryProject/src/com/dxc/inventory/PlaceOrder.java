package com.dxc.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class PlaceOrder {
	public static void main(String[] args) {
		String stockId;
		int qtyOrd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StockId  ");
		stockId = sc.nextLine();
		System.out.println("Enter Quantity Ordered  ");
		qtyOrd = Integer.parseInt(sc.nextLine());
		StockDAO dao = new StockDAO();
		try {
			System.out.println(dao.placeOrder(stockId, qtyOrd));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
