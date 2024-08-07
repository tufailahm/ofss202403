package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class MsgTest {

	@Test
	@Order(value = 2)
	@DisplayName(value = "Test Good Morning")
	public void testDate1() {
		Msg msg = new Msg();
		String expected = "Good Morning folks!!";
		assertEquals(expected, msg.message(10));
	}

	@Test
	@Order(value = 1)
	@DisplayName(value = "Test Good Afternoon")
	public void testDate2() {
		Msg msg = new Msg();
		assertEquals("Good afternoon Guys!!", msg.message(13));
	}

	@Test
	@Order(value = 3)
	@DisplayName(value = "Test Good Evening")
	public void testDate3() {
		Msg msg = new Msg();
		assertEquals("Good Evening buddies!!", msg.message(16));
	}

	@Test

	@Timeout(6) // Set timeout to 6 seconds
	public void test1() throws InterruptedException {
		Thread.sleep(4000); // Simulate a 5-second delay
		System.out.println("Test1 Passed within the time");
	}

	@Test
	public void test3() {
		Assertions.assertTimeout(Duration.ofSeconds(6), () -> delaySeconds(4));
		// Assert a timeout of 7 seconds for a
		// 6-second delay
		System.out.println("Test3 Passed within the time");
	}

	// Helper method to simulate delays
	private void delaySeconds(int seconds) throws InterruptedException {
		TimeUnit.SECONDS.sleep(seconds);
	}

}
