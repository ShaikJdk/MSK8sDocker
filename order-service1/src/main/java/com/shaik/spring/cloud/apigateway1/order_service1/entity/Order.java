package com.shaik.spring.cloud.apigateway1.order_service1.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name="ORDERS1")
public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Order() {
		
	}
	@Id
	@Column(name="order_id")
	private Integer orderId;
	
	@Column(name="order_name")
	private String orderName;
	
	@Column(name="order_type")
	private String orderType;
	
	@Column(name="price")
	private double price;

	public Integer getOrderId() {
		return orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public String getOrderType() {
		return orderType;
	}

	public double getPrice() {
		return price;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order(Integer orderId, String orderName, String orderType, double price) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderType = orderType;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderType=" + orderType + ", price="
				+ price + "]";
	}
	
	
}