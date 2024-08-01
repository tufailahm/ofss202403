package com.training.utility;

import java.util.Random;

public class RandomNumberGenerator {

	public String generateNumber() {
		// create instance of Random class
		Random random = new Random();

		// Generate random integers in range 0 to 999
		int rand_int1 = random.nextInt(10000);

		return "V00-"+rand_int1+"-2024";

	}
}