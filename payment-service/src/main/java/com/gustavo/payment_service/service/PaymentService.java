package com.gustavo.payment_service.service;


import com.gustavo.payment_service.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
