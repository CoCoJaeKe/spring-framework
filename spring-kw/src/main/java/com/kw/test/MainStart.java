package com.kw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author kewei
 * @Date 2022/1/18 9:28 下午
 * @Description
 * @Version 1.0
 */

@Configuration
@ComponentScan("com.kw.test")
public class MainStart {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MainStart.class);
		User user = context.getBean(User.class);
		user.sayKW();
	}
}
