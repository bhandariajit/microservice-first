package com.citi.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citi.order.domain.Item;
import com.citi.order.domain.ItemOrder;

@Service
public class ItemOrderService {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private ItemProxy itemProxy;
	
	public ItemOrder getOrderDetails(int itemCode, int quantity) {
		String url = "http://localhost:8080/item/" + itemCode;
		Item item = template.getForObject(url, Item.class);
		double totalAmount = quantity * item.getPrice();
		return new ItemOrder(itemCode, item.getName(), totalAmount);
	}
	
	public ItemOrder getOrderDetailsThroughFeignProxy(int itemCode, int quantity) {		
		Item item = itemProxy.getItemDetails(itemCode);
		double totalAmount = quantity * item.getPrice();			
		ItemOrder itemOrder = new ItemOrder(itemCode, item.getName(), totalAmount);
		itemOrder.setPort(item.getPort());
		return itemOrder;
	}
}
