package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.utility.Message;
import com.training.utility.RandomNumberGenerator;

@Configuration
public class BankingConfiguration {
	@Bean(name = "start")
	public Message start() {
		return new Message("Batch Started Today!!");
	}
	@Bean(name = "end")
	public Message end() {
		return new Message("Batch Ended Today!!");
	}

	@Bean(name = "randint")
	public RandomNumberGenerator randint() {
		return new RandomNumberGenerator();
	}

}
