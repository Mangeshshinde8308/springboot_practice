package com.deliveryboy.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppConstant;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private Logger logger=LoggerFactory.getLogger(KafkaService.class);
	
	public boolean updateLocation(String location) {
		
		this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME, location);
		this.logger.info("location produced");
		return true;
		
	}
	
}
