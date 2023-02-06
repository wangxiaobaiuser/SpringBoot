package com.qianfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangAoJie
 * 2023-02-06 10:51
 */

@ResponseBody
@Controller
public class DemoController {

    @RequestMapping("/")
    public String testHello(){
        return "Hello,Spring Boot 2";
    }

}
