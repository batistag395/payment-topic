package com.gustavo.payment_service.resource.impl;

import com.gustavo.payment_service.model.Payment;
import com.gustavo.payment_service.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;
    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: pagamento recebido {}", payment);
        Thread.sleep(1000);
        log.info("Enviado pagamento....");
        kafkaTemplate.send("payment-topic", payment);
    }
}
