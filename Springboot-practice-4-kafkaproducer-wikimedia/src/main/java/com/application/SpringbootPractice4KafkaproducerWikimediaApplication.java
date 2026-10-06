package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.service.WikipediaChangeProducer;

@SpringBootApplication
public class SpringbootPractice4KafkaproducerWikimediaApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(SpringbootPractice4KafkaproducerWikimediaApplication.class, args);
	}
	@Autowired
	public WikipediaChangeProducer wikipediaChangeProducer;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		wikipediaChangeProducer.sendMesssage();
		 
	}
	
	

}
