package com.sample.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
		helloWorld.setName("Nitin");
		helloWorld.printHello();
	}

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
