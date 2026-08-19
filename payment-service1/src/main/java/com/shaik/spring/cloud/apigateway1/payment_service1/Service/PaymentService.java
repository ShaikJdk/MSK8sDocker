package com.shaik.spring.cloud.apigateway1.payment_service1.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shaik.spring.cloud.apigateway1.payment_service1.entity.Payment;
import com.shaik.spring.cloud.apigateway1.payment_service1.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment makePayment(Payment payment) {

        return paymentRepository.save(payment);
    }

    public Optional<Payment> getPaymentDetails(Integer paymentId) {

        return paymentRepository.findById(paymentId);
    }
}