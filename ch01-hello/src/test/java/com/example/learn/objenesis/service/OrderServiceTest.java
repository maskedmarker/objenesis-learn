package com.example.learn.objenesis.service;

import org.junit.Test;
import org.objenesis.ObjenesisHelper;

import static org.junit.Assert.*;

public class OrderServiceTest {

    @Test
    public void test0() {
        OrderService newInstance = ObjenesisHelper.newInstance(OrderService.class);
        System.out.println("newInstance = " + newInstance);
    }
}