package com.boa.training.firstmicroservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.boa.training.firstmicroservice.domain.Item;

@Service
public class ItemService {
	private Map<Integer, Item> map=new HashMap<Integer, Item>();
	public ItemService()
	{
		map.put(101, new Item(101, "Apple", 100));
		map.put(102, new Item(102, "Orange", 60));
		map.put(103, new Item(103, "Mango", 70));
	}
	public Item getItemDetail(int id)
	{
		return map.get(id);
	}
}
