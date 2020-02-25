package com.citi.order.domain;

public class ItemOrder {

	private int itemCode;
	private String itemName;
	private double totalAmount;
	private int port;
	
	public ItemOrder(int itemCode, String itemName, double totalAmount) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.totalAmount = totalAmount;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	
}
