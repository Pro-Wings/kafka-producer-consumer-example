package com.prowings.kafka_producer_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.prowings.kafka_producer_api.model.Employee;

@Service
public class PublisherService {

	private static final String TOPIC = "employeetest";

//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private KafkaTemplate<String, Employee> kafkaTemplate;

//	public void sendMessage(String message) {
//		kafkaTemplate.send(TOPIC, message);
//	}

	public void sendMessage(Employee message) {
		kafkaTemplate.send(TOPIC, message);
	}

}
