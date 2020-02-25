package com.citi.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.item.domain.Item;
import com.citi.item.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping(value = "/{code}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Item> findItemDetails(@PathVariable("code") int code) {
		System.out.println("in controler ");
		return new ResponseEntity<Item>(itemService.getItem(code), HttpStatus.OK);
	}
}
