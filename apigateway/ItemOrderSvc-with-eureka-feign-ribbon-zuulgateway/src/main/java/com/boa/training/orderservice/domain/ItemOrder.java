package com.boa.training.orderservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ItemOrder {
	private int itemId;
	private String itemName;
	private double totalAmount;
	private int port;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	public ItemOrder(int itemId, String itemName, double totalAmount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.totalAmount = totalAmount;
	}
	public ItemOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	

	
}
