package com.example.learn.objenesis.service;

import com.example.learn.objenesis.model.Order;

public class RepositoryService {

    public void handleOrder(Order order) {
        System.out.println(RepositoryService.class.getSimpleName() + ": order = " + order);
    }
}
