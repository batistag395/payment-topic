package com.gustavo.payment_service_json_conumer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;
}
