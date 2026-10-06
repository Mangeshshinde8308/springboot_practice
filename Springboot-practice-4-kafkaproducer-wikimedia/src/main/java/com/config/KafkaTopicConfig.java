package com.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.appconstant.AppConstant;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	private NewTopic topic() {
		return TopicBuilder.
				name(AppConstant.TOPIC)
				.build();
		
	}

}
