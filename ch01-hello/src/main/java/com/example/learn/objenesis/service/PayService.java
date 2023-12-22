package com.example.learn.objenesis.service;

import com.example.learn.objenesis.model.Order;

public class PayService {

    public void handleOrder(Order order) {
        System.out.println(PayService.class.getSimpleName() + ": order = " + order);
    }
}
