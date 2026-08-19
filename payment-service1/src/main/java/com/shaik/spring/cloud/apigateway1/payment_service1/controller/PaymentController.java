package com.shaik.spring.cloud.apigateway1.payment_service1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shaik.spring.cloud.apigateway1.payment_service1.Service.PaymentService;
import com.shaik.spring.cloud.apigateway1.payment_service1.entity.Payment;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/doPayment")
    public ResponseEntity<Payment> makePayment(
            @RequestBody Payment payment) {

        Payment savedPayment = paymentService.makePayment(payment);

        return ResponseEntity.ok(savedPayment);
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<Payment> getPaymentDetails(
            @PathVariable Integer paymentId) {

        return paymentService.getPaymentDetails(paymentId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}