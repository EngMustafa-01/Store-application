package com.moshstore.store;

import org.springframework.stereotype.Service;

//@Service("paypal")
public class PayPalPaymentService implements PaymentService{
    @Override
    public void paymentProcess(double amount) {
        System.out.println("===PAYPAL===");
        System.out.println("Payment amount= " + amount);
        System.out.println("THANKS for using PayPal 😊");
    }
}
