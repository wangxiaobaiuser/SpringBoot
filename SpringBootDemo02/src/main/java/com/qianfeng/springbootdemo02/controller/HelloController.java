package com.qianfeng.springbootdemo02.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangAoJie
 * 2023-02-06 11:11
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot";
    }

}
