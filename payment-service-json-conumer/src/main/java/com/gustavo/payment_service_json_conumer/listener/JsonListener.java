package com.gustavo.payment_service_json_conumer.listener;

import com.gustavo.payment_service_json_conumer.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JsonListener {
    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antiFraude(@Payload Payment payment){
        log.info("Recebi o pagamento ::: {}", payment);
        Thread.sleep(2000);
        log.info("Validando fraude...");
        Thread.sleep(2000);
        log.info("Compra aprovada.");
        Thread.sleep(2000);
    }
    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerate(){
        Thread.sleep(3000);
        log.info("Gerando PDF...");
        Thread.sleep(3000);
    }
    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail(){
        Thread.sleep(3000);
        log.info("Enviando email...");
    }

}
