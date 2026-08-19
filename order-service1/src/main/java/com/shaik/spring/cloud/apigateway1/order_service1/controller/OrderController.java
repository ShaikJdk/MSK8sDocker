package com.shaik.spring.cloud.apigateway1.order_service1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shaik.spring.cloud.apigateway1.order_service1.dto.OrderResponse;
import com.shaik.spring.cloud.apigateway1.order_service1.entity.Order;
import com.shaik.spring.cloud.apigateway1.order_service1.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(value="/bookOrder", headers = "Accept=application/json") 
	public ResponseEntity<OrderResponse> bookOrder(@RequestBody Order order) {
    	OrderResponse orderResponse = null;
		try {
			orderResponse =  orderService.createOrder(order);
		} catch(Exception e) {
			return new ResponseEntity<OrderResponse>(HttpStatus.EXPECTATION_FAILED); 
		}
		
		return new ResponseEntity<OrderResponse>(orderResponse, HttpStatus.CREATED);

	}

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(
            @PathVariable Integer orderId) {

    	Order outputOrder = null;
		try {
			outputOrder =  orderService.getOrder(orderId);
		} catch(Exception e) {
			return new ResponseEntity<Order>(HttpStatus.EXPECTATION_FAILED); 
		}
		
		return new ResponseEntity<Order>(outputOrder, HttpStatus.OK);

	}
}
