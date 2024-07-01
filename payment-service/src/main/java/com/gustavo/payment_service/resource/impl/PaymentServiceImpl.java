package com.gustavo.payment_service.resource.impl;

import com.gustavo.payment_service.model.Payment;
import com.gustavo.payment_service.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: pagamento recebido {}", payment);
    }
}
