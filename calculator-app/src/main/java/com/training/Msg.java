package com.training;

public class Msg {
	public String message(int time) {
		if(time>=9 && time<12)
			return "Good Morning folks!!";
		else if (time>=12 && time<15)
			return "Good afternoon Guys!!";
		else if (time>=15 && time<17)
			return "Good Evening buddies!!";
		else 
			return "Incorrect";
	}
}