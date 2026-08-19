package com.shaik.spring.cloud.apigateway1.payment_service1.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "PAYMENT1")
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Payment() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_seq1")
	@SequenceGenerator(name = "payment_seq1", sequenceName = "PAYMENT_SEQ1", allocationSize = 1)
	@Column(name = "payment_id")
	private Integer paymentId;

	@Column(name = "tnx_id")
	private String tnxId;

	@Column(name = "payment_status")
	private String paymentStatus;

	@Column(name = "order_id")
	private Integer orderId;

	@Column(name = "order_price")
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
