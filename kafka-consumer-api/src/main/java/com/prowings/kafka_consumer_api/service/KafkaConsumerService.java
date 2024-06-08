package com.prowings.kafka_consumer_api.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "test", groupId = "group_id")
	public void consume(String message) {
		System.out.println(">>>>>>>>>> Consumed message: " + message);
	}
}
