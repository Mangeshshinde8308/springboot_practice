package com.enduser.consumerkafkaconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.enduser.AppConstant;

@Configuration
public class ConsumerConfig {
	
	@KafkaListener(topics=AppConstant.LOCATION_UPDATE_TOPIC,groupId=AppConstant.GROUP_ID)
	public void updateLocationConsumer(String value) {
		
		System.out.println(value);
		
	}

}
