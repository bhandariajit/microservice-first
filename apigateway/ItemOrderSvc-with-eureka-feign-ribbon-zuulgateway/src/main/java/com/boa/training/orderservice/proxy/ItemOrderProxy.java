package com.boa.training.orderservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.boa.training.orderservice.domain.Item;

@FeignClient(name="ZuulApiGateway")
@RibbonClient(name="item-micro-service")
public interface ItemOrderProxy {
	@GetMapping("/item-micro-service/item/{code}")
	public Item getItem(@PathVariable("code") int itemCode);

}
