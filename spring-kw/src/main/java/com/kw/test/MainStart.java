package com.kw.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
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
		// 加载spring上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);

		// 使用了简单工厂设计模式
		// 传入一个参数，动态的获取实例 beanFactory接口中getBean()方法
		User user = context.getBean(User.class);
		user.sayKW();

		// ApplicationContext 与 BeanFactory区别：
		// 共同点：都有生产bean的能力
		// 区别：ApplicationContext可包含上下文，一切bean的生命周期等; BeanFactor只是一个生产bean的机器，给什么样的图纸生产什么样的bean、未实现很多扩展点
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		// beanFactory.registerBeanDefinition();
		// beanFactory.getBean();


		/**
		 * 关于scanner
		 */
		// 加载spring上下文 此时不用指定具体的配置类
		AnnotationConfigApplicationContext contextScan = new AnnotationConfigApplicationContext();
		// 单独扫描这个包
		contextScan.scan("com.kw.test");
	}
}
