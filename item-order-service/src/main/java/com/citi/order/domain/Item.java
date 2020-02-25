package com.citi.order.domain;

public class Item {
	
	private int code;
	private String name;
	private double price;
	private int port;
		
	public Item() {
		super();
	}
	
	public Item(int code, String name, double price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
		
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

}
