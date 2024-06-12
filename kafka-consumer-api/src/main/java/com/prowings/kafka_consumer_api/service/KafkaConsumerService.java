package com.prowings.kafka_consumer_api.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prowings.kafka_consumer_api.model.Employee;

@Service
public class KafkaConsumerService {

	
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
//	@KafkaListener(topics = "test", groupId = "group_id")
//	public void consume(String message) {
//		System.out.println(">>>>>>>>>> Consumed message: " + message);
//	}

//	@KafkaListener(topics = "employeetest", groupId = "group_id")
    @KafkaListener(topics = "employee_test", groupId = "json-consumer-group", containerFactory = "kafkaListenerContainerFactory")
	public void consume(ConsumerRecord<String, String> data) throws JsonMappingException, JsonProcessingException {
    	
    	System.out.println(">>>>>>>>>> Consumed message: " + data.value());
    	
    	Employee emp = OBJECT_MAPPER.readValue(data.value(), Employee.class);
    	
		if(emp.getEaddress().equalsIgnoreCase("pune"))
		{
			System.out.println(">>>>>>>> Employee from PUNE!!");
		}
	}
}
