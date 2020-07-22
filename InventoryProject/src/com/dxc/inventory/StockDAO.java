package com.dxc.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDAO {

	Connection connection;
	PreparedStatement pst;
	
	public int generateOrderId() throws SQLException {
		connection = ConnectionHelper.getConnection();
		int ordid=0;
		pst=connection.prepareStatement("SELECT CASE WHEN MAX(OrderId) IS NULL THEN 1 " + 
				"   ELSE MAX(OrderId)+1 END ordid FROM Orders");
		ResultSet rs = pst.executeQuery();
		rs.next();
		ordid = rs.getInt("ordid");
		return ordid;
	}
	
	public String placeOrder(String stockId, int qtyOrd) throws SQLException {
		connection = ConnectionHelper.getConnection();
		int ordid = generateOrderId();
		System.out.println(ordid);
		Stock stock = searchStock(stockId);
		if (stock !=null) {
			int qtyAvail = stock.getQuantityAvail();
			int price = stock.getPrice();
			if (qtyAvail-qtyOrd >= 1) {
				String cmd = "UPDATE STOCK SET QuantityAvail=? "
						+ " WHERE StockID=?";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, qtyAvail-qtyOrd);
				pst.setString(2, stockId);
				pst.executeUpdate();
				int billAmount = price * qtyOrd;
				String cmdNew = "INSERT INTO ORDERS(OrderId,StockID,QtyOrd,billAmt)"
						+ " VALUES(?, ?, ?, ?)";
				pst = connection.prepareStatement(cmdNew);
							pst.setInt(1, ordid);
				pst.setString(2, stockId);
				pst.setInt(3, qtyOrd);
				pst.setInt(4, billAmount);
				pst.executeUpdate();
				String cmdAmt = "UPDATE AMOUNT SET GAMT=GAMT+?";
				pst = connection.prepareStatement(cmdAmt);
				pst.setInt(1, billAmount);
				pst.executeUpdate();
				return "Order Placed Successfully...";
			} else {
				return "Insufficient Quantity...";
			}
		} else {
			return "Invalid StockId";
		}
	}
	public Stock searchStock(String stockId) throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Stock where StockID=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stockId);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		if (rs.next()) {
			stock = new Stock();
			stock.setStockId(stockId);
			stock.setItemName(rs.getString("ItemName"));
			stock.setPrice(rs.getInt("price"));
			stock.setQuantityAvail(rs.getInt("QuantityAvail"));
		}
		return stock;
	}
	public String addStock(Stock stock) throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "INSERT INTO STOCK(STOCKID, ItemName, Price, "
				+ "QuantityAvail) values(?, ?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stock.getStockId());
		pst.setString(2, stock.getItemName());
		pst.setInt(3, stock.getPrice());
		pst.setInt(4, stock.getQuantityAvail());
		pst.executeUpdate();
		return "Stock Added...";
	}
	public String generateStockId() throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(stockid) IS NULL THEN "
				+ " 'S001' ELSE max(stockid) END sid from Stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String sid = rs.getString("sid");
		return sid;
	}
}
