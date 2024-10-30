package com.test.kafka.service;

import java.util.concurrent.CompletableFuture;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessagePublisher {

	@Autowired
	KafkaTemplate<String, Object> template;
	
	public void publish(Object obj)
	{
		for(int i=0; i<1000; i++)
		{
			CompletableFuture<SendResult<String, Object>> sendRes = template.send(new ProducerRecord<String, Object>("north-topic", "This is another"));
			
		}
		// sendRes.whenComplete((p,q) -> System.out.println(p));
	}
}
