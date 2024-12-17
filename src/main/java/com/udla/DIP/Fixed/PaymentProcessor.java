package com.udla.DIP.Fixed;

public class PaymentProcessor {
    private final PaymentMethodPayment payment;

    public PaymentProcessor(PaymentMethodPayment payment) {
        this.payment = payment;
    }

    public void makePayment(double amount) {
        payment.processPayment(amount);
    }
}
