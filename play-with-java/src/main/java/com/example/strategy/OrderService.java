package com.example.strategy;

public class OrderService {

    private PaymentStrategy payPalPayment;

    public void setPayPalPayment(PaymentStrategy paymentStrategy) {
        this.payPalPayment = payPalPayment;
    }

    public void processOrder(){
        //...
        payPalPayment.processPayment();
    }

}
