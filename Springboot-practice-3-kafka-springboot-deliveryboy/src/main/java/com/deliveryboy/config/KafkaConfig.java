package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaConfig {
	//AppConstant appConstant;

	@Bean
	public NewTopic topic() {
		
		
		return TopicBuilder
				.name(AppConstant.LOCATION_TOPIC_NAME)
			//	.partitions(0)
			//	.replicas(0)
				.build();
		
	}
}
