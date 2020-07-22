package com.dxc.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class AddStockMain {

	public static void main(String[] args) {
		StockDAO dao = new StockDAO();
		Stock stock = new Stock();
		try {
			System.out.println(dao.generateStockId());
			String sid = dao.generateStockId();
			int id = Integer.parseInt(sid.substring(1));
			id++;
			String res="";
			if (id >=1 && id <= 9) {
				res="S00"+id;
			}
			if (id >= 10 && id <= 99) {
				res = "S0"+id;
			}
			if (id >= 100 && id <= 999) {
				res = "S" +id;
			}
			stock.setStockId(res);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Name   ");
		stock.setItemName(sc.nextLine());
		System.out.println("Enter Price  ");
		stock.setPrice(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter QuantityAvail  ");
		stock.setQuantityAvail(Integer.parseInt(sc.nextLine())); 
		try {
			System.out.println(dao.addStock(stock));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
