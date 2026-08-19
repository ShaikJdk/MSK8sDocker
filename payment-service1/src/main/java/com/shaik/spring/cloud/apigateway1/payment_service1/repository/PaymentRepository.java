package com.shaik.spring.cloud.apigateway1.payment_service1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shaik.spring.cloud.apigateway1.payment_service1.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}