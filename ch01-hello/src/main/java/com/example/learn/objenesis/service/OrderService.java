package com.example.learn.objenesis.service;

import com.example.learn.objenesis.model.Order;

public class OrderService {

    private PayService payService;

    private RepositoryService repositoryService;

    private int delayInMs = 1000;

    public OrderService(PayService payService, RepositoryService repositoryService) {
        this.payService = payService;
        this.repositoryService = repositoryService;
    }

    public void handle(Order order) {
        System.out.println(OrderService.class.getSimpleName() + ": order = " + order);
    }
}
