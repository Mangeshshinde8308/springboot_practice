package com.service;

import java.beans.JavaBean;
import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.appconstant.AppConstant;
import com.handler.WikiMediaChangehandler;
import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;
import com.launchdarkly.eventsource.MessageEvent;



@Service
@Component
public class WikipediaChangeProducer {
  
	
	private static final Logger LOGGER=LoggerFactory.getLogger(WikipediaChangeProducer.class);
	
	
	private KafkaTemplate<String, String > kafkaTemplate;
    
	public WikipediaChangeProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@Bean
	public void sendMesssage() throws InterruptedException {
		
		String topic="wikimedia_recentchange";
		//To read real time stream data from wikipedia, we use event source.
		
		
		EventHandler eventHandler=new WikiMediaChangehandler(kafkaTemplate,topic);
		String url="https://stream.wikimedia.org/v2/stream/recentchange";
		EventSource.Builder builder=new EventSource.Builder(eventHandler, URI.create(url));
		EventSource eventSource=builder.build();
		eventSource.start();
		
		TimeUnit.MINUTES.sleep(10);
		
	
	}
}

