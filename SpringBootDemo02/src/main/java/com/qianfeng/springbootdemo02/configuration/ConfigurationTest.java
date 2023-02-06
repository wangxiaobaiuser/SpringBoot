package com.qianfeng.springbootdemo02.configuration;

import com.qianfeng.springbootdemo02.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @author wangAoJie
 * 2023-02-06 14:32
 */
@Configuration(proxyBeanMethods = false)
public class ConfigurationTest {

    @Bean
    public User user(){
        return new User("wangAoJie",18,new Date());
    }
}
