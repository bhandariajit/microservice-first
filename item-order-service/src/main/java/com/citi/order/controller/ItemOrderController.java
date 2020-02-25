package com.citi.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.order.domain.ItemOrder;
import com.citi.order.service.ItemOrderService;

@RestController
@RequestMapping("/itemorder")
public class ItemOrderController {

	@Autowired
	private ItemOrderService service;
	
	@GetMapping(value = "/{code}/qty/{quantity}")
	public ResponseEntity<ItemOrder> getItemOrderDetails(@PathVariable("code") int code,
			@PathVariable("quantity") int quantity){	
		return new ResponseEntity<ItemOrder>(service.getOrderDetailsThroughFeignProxy(code, quantity), HttpStatus.OK);
	}
}
