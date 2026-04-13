package com.moshstore.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    private PaymentService paymentService;

//    @Autowired // Used when we have more than one constructor
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("OrderService Bean is initialized...");
//    }
//
//    @PreDestroy
//    public void cleanup() {
//        System.out.println("OrderService Bean is Destroyed..");
//    }

    public void placeOrder() {
        paymentService.paymentProcess(10);
    }
}
