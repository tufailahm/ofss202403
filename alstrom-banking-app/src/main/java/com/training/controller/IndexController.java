package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.utility.Message;
import com.training.utility.RandomNumberGenerator;

@RestController
@RequestMapping("index")
public class IndexController {

	@GetMapping("guest")		//http://localhost:9090/index/guest
	public String sayHello() {
		return "Hello Visitors, welcome in Alstrom Bank";
	}
	
	@GetMapping("myintro")
	public String getName() {
		return "Hi I Am Mohammad Tufail Ahmed";
	}
	
	@Autowired
	@Qualifier("start")
	Message message2;	
	
	@GetMapping("todaysmessage")
	public String todaysMessage() {
		return message2.getMessage();
	}
	
	
	//http://localhost:9090/index/ofss	- Welcome OFSS Trainee
	
	@Autowired
	RandomNumberGenerator randomNumberGenerator;
	
	@GetMapping("getvisitorid")	
	public String getVisitorID() {
		return randomNumberGenerator.generateNumber();
	}
}
