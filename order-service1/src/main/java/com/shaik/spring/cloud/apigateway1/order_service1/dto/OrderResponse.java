package com.shaik.spring.cloud.apigateway1.order_service1.dto;

import com.shaik.spring.cloud.apigateway1.order_service1.entity.Order;

public class OrderResponse {

	private Order order;
	private Payment payment;
	public Order getOrder() {
		return order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
