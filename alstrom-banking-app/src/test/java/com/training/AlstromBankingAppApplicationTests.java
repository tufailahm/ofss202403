package com.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlstromBankingAppApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test				// this test will fail
	void testAdd() {
		assertTrue(false);
	}

}
