package com.shaik.spring.cloud.apigateway1.order_service1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.shaik.spring.cloud.apigateway1.order_service1.dto.OrderResponse;
import com.shaik.spring.cloud.apigateway1.order_service1.dto.Payment;
import com.shaik.spring.cloud.apigateway1.order_service1.entity.Order;
import com.shaik.spring.cloud.apigateway1.order_service1.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final WebClient webClient;

    public OrderService(OrderRepository orderRepository,
                        WebClient webClient) {

        this.orderRepository = orderRepository;
        this.webClient = webClient;
    }

    public OrderResponse createOrder(Order order) {

        Order savedOrder = orderRepository.save(order);

        Payment request = new Payment();

        request.setOrderId(savedOrder.getOrderId());
        request.setOrderPrice(savedOrder.getPrice());

        Payment paymentResponse =
                webClient.post()
                        .uri("http://localhost:6062/payments/doPayment")
                        .bodyValue(request)
                        .retrieve()
                        .bodyToMono(Payment.class)
                        .block();

        OrderResponse orderResponse = new OrderResponse();

        orderResponse.setOrder(savedOrder);
        orderResponse.setPayment(paymentResponse);

        return orderResponse;
    }

    public Order getOrder(Integer orderId) {

        return orderRepository.findById(orderId)
                .orElseThrow(() ->
                        new RuntimeException("Order not found"));
    }
}