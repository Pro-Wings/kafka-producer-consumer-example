package com.prowings.kafka_consumer_api.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.prowings.kafka_producer_api.model.Employee;

@Service
public class KafkaConsumerService {

//	@KafkaListener(topics = "test", groupId = "group_id")
//	public void consume(String message) {
//		System.out.println(">>>>>>>>>> Consumed message: " + message);
//	}

//	@KafkaListener(topics = "employeetest", groupId = "group_id")
    @KafkaListener(topics = "employeetest", groupId = "json-consumer-group", containerFactory = "kafkaListenerContainerFactory")
	public void consume(Employee message) {
		System.out.println(">>>>>>>>>> Consumed message: " + message);
		if(message.getEaddress().equalsIgnoreCase("pune"))
		{
			System.out.println(">>>>>>>> Employee from PUNE!!");
		}
	}
}
