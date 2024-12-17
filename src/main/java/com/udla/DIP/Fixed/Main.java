package com.udla.DIP.Fixed;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new CreditCardPayment());
        processor.makePayment(150.0);
    }
}
