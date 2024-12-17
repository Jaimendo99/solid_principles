package com.udla.DIP.Fixed;

public class CreditCardPayment implements PaymentMethodPayment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
