package com.boa.training.orderservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.training.orderservice.domain.ItemOrder;
import com.boa.training.orderservice.service.ItemOrderService;

@RestController
@RequestMapping("/itemorder")
public class ItemOrderController {
	@Autowired
	private ItemOrderService orderService;
	
	private  Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value = "/{code}/quantity/{qty}",
			produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<ItemOrder> getItemOrderDetails
	(@PathVariable("code")int itemCode,@PathVariable("qty")int quantity)
	
	{
		//System.out.println("controller");
		ItemOrder order=orderService.getItemOrderDataThroughFeign(itemCode, 
				quantity);
		logger.info("item order {}"+order);
		return 
				new ResponseEntity<ItemOrder>(order,HttpStatus.OK);
	}
	

}
