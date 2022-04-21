package com.example.controller.impl;

import com.example.controller.SampleController;
import com.example.service.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleControllerImpl implements SampleController{

    @Autowired
    SampleService sampleService;
    
    @RequestMapping("/hello")
    public String getHello() {
        return sampleService.outputHello();
    }
    
}
