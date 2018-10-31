package com.example.demo.impl;

import com.example.demo.contract.IOrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
@Qualifier("DefaultOrderServiceImpl")
public class DefaultOrderServiceImpl implements IOrderService {

    public String sayName() {
        return "1234";
    }
}
