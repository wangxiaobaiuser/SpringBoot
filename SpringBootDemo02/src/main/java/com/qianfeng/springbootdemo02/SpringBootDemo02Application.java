package com.qianfeng.springbootdemo02;

import com.qianfeng.springbootdemo02.bean.User;
import com.qianfeng.springbootdemo02.configuration.ConfigurationTest;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author wangAoJie
 */
@SpringBootApplication
public class SpringBootDemo02Application {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDemo02Application.class, args);

		ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();

		ConfigurationTest bean = beanFactory.getBean(ConfigurationTest.class);

		User tom01 = bean.user();
		User tom02 = bean.user();
		System.out.println(tom01 == tom02);
	}

}
