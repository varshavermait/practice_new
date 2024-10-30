package com.test.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topics = "north-topic", groupId = "grp1")
	public void consume(String message) {
		System.out.println("consumed by consumer1*** "+message);
	}
}
