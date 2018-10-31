package com.example.demo.impl;

import com.example.demo.contract.IOrderService;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderServiceImpl implements IOrderService {

    public String sayName() {
        return "123";
    }
}
