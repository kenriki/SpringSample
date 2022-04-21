package com.example.service.impl;

import com.example.service.SampleService;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{

    public String outputHello() {
        return "Helloサービス";
    }
    
}
