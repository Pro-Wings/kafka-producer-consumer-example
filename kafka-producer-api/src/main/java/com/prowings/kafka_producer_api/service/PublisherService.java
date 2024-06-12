package com.prowings.kafka_producer_api.service;

import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.prowings.kafka_producer_api.model.Employee;

@Service
public class PublisherService {

	private static final String TOPIC = "employee_test";

//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private Producer<String, Employee> kafkaProducer;

//	public void sendMessage(String message) {
//		kafkaTemplate.send(TOPIC, message);
//	}

	public void sendMessage(Employee message) {

		Future<RecordMetadata> res = kafkaProducer.send(new ProducerRecord<>(TOPIC, message));
	}

}
