package com.shaik.spring.cloud.apigateway1.order_service1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shaik.spring.cloud.apigateway1.order_service1.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
