package com.test.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.kafka.service.KafkaMessagePublisher;

@RestController
@RequestMapping("producer-app")
public class KafkaProducerController {
	@Autowired
	KafkaMessagePublisher publisher;
	
	@GetMapping("/publish")
	public void publishMessage(){
		// System.out.println("came to publish");
		publisher.publish("Hi Hello");;
		
	}
}
