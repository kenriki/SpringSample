package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * Hello を取得する
 */
@RestController
public interface SampleController {
    /**
     * Hello を取得する
     * @return
     */
    public String getHello();
}