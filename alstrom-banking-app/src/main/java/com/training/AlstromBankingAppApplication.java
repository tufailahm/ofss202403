package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.training.utility.Message;
import com.training.utility.RandomNumberGenerator;

@SpringBootApplication		//will discuss
public class AlstromBankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlstromBankingAppApplication.class, args);
	}
	

}
