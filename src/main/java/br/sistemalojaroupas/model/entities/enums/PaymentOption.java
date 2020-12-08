/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities.enums;

/**
 *
 * @author silas
 */
public enum PaymentOption {
    MONEY(1),
    CREDIT(2),
    DEBIT(3),
    MONEY_CREDIT(4);
    
    private int code;
    
    private PaymentOption(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
    
    public PaymentOption valueOf(int code) {
        for (PaymentOption value : PaymentOption.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código inválido");
    }
}
