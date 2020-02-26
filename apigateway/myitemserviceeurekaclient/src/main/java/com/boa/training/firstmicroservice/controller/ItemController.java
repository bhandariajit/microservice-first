package com.boa.training.firstmicroservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.training.firstmicroservice.domain.Item;
import com.boa.training.firstmicroservice.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService service;
	
	//private  Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment env;
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	@GetMapping(value = "/av/{code}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Item> getData(@PathVariable("code")int code){
			Item item=service.getItemDetail(code);
			int port=Integer.parseInt(env.getProperty("local.server.port"));
			item.setPort(port);
		logger.info("item controller {}"+item);	
		
		
		return new ResponseEntity<Item>(item,HttpStatus.OK);
	} 
	}
