package com.boa.training.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.boa.training.orderservice.domain.Item;
import com.boa.training.orderservice.domain.ItemOrder;
import com.boa.training.orderservice.proxy.ItemOrderProxy;

@Service
public class ItemOrderService {
	/*
	 * @Autowired private RestTemplate template;
	 */
	
	@Autowired
	private ItemOrderProxy itemOrderProxy;

	/*
	 * public ItemOrder getItemOrderData(int itemCode,int quantity) { String
	 * url="http://localhost:8081/item/"+itemCode; Item
	 * item=template.getForObject(url, Item.class); double price=item.getPrice();
	 * double totalAmount=quantity*price; return new ItemOrder(itemCode,
	 * item.getItemName(), totalAmount); }
	 */
	
	public ItemOrder getItemOrderDataThroughFeign(int itemCode,int quantity)
	{
		System.out.println("calling proxy");
		Item item=itemOrderProxy.getItem(itemCode);
		double price=item.getPrice();
		double totalAmount=quantity*price;
		ItemOrder order=new ItemOrder(itemCode, item.getItemName(), totalAmount);
		order.setPort(item.getPort());
		return order;
	}
	
	
}
