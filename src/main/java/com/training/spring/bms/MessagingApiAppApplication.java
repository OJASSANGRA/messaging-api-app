package com.training.spring.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {

	
	public void printGreetings() {
		System.out.println("HI Oracle");
		System.out.println("Hello Oracle");

	}
	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
		System.out.println("HI Oracle");
		System.out.println("Hello Oracle");
	}

}
