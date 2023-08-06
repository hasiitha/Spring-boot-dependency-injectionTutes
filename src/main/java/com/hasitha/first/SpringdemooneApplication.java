package com.hasitha.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemooneApplication {

	public static void main(String[] args) {
		ApplicationContext obj = SpringApplication.run(SpringdemooneApplication.class, args);
		Alien alien;
		alien = obj.getBean(Alien.class);
		alien.code();
	}

}
