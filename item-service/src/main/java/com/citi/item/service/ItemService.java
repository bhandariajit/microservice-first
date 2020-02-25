package com.citi.item.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.citi.item.domain.Item;

@Service
public class ItemService {
	
	private Map<Integer,Item> items = new HashMap<>();
	
	@Autowired
	private Environment env;
	
	public ItemService() {
		items.put(3001, new Item(3001, "Mango", 60));
		items.put(3002, new Item(3002, "apple", 160));
		items.put(3003, new Item(3003, "orange", 100));
	}
	
	public Item getItem(int itemCode) {
		Item item = items.get(itemCode);
		item.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return item;
	}
	
	
}
