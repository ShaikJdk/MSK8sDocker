package com.shaik.spring.cloud.apigateway1.order_service1.dto;

import java.io.Serializable;

public class Payment implements Serializable {
	public Payment() {

	}

	
	private Integer paymentId;

	private String tnxId;

	private String paymentStatus;

	private Integer orderId;

	private double orderPrice;

	public Integer getPaymentId() {
		return paymentId;
	}

	public String getTnxId() {
		return tnxId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public void setTnxId(String tnxId) {
		this.tnxId = tnxId;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

}
