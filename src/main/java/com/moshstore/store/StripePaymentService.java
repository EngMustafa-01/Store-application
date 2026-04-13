package com.moshstore.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.apiURL}")
    private String apiURL;

    @Value("${stripe.supported-currencies}")
    private String currency;

    @Value("${stripe.enabled}")
    private String enabled;

    @Override
    public void paymentProcess(double amount){

        System.out.println("API URL: " + apiURL);
        System.out.println("Supported currency: " +currency);
        System.out.println("Stripe enabled: " +enabled);
        System.out.println("Timeout: "+timeout);


        System.out.println("===STRIPE===");
        System.out.println("Payment amount= " + amount);
        System.out.println("THANKS for using STRIPE 😊");
    }
}
