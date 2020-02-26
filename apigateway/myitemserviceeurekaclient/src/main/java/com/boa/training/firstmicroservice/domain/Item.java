package com.boa.training.firstmicroservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {
	private int itemCode;
	private String itemName;
	private double price;
	private int port;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Item(int itemCode, String itemName, double price) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	public Item() {
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
