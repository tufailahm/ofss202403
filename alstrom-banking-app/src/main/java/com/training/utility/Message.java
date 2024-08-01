package com.training.utility;

import org.springframework.stereotype.Component;

@Component //message
public class Message
{
	String textMessage;
	public Message() {
		textMessage = "Welcome OFSS";
	}
	public Message(String textMessage) {
		this.textMessage = textMessage;
	}
	public String getMessage()		
	{
		return textMessage;
	}
}