package com.sample.component;

import org.springframework.stereotype.Component;

@Component
public class WelcomeComponent {

	public void sayHello(String name) {
		System.out.println("Welcome " + name);;
	}
}
