package com.test.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaTestApplication.class, args);
		System.out.println("Hi, started spring application");
	}
	

}
