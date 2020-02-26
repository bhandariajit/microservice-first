package com.citi.order.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.citi.order.domain.Item;

@FeignClient(name = "ZuulApiGateway")
@RibbonClient(name = "itemService")
public interface ItemProxy {

	@GetMapping("/itemService/item/{code}")
	public Item getItemDetails(@PathVariable("code") int code);
	
	//method name can be anything. url should match..
}
