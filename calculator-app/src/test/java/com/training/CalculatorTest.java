package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
	final int myOrder = 5;

	@Test // annotation to mark the test
	@DisplayName("6. Testing whole and negative number 30 and -10")
//	@Disabled
	@Order(value = myOrder + 1)
	public void testApple() {
		Calculator calculator1 = new Calculator();
		int actual = calculator1.add(30, -10);
		int expected = 20;
		assertEquals(expected, actual);
	}

	Calculator calculator6;

	@Order(5)
	@Test // annotation to mark the test
	@DisplayName("5. Testing same number 10 and 10")
	@RepeatedTest(3)
	public void testBall() {
		Calculator calculator2 = new Calculator();
		calculator6 = new Calculator();
		int actual = calculator2.add(10, 10);
		int expected = 20;
		assertEquals(expected, actual);
	}

	@Test // annotation to mark the test
	@DisplayName("7. Testing different number 12 and 8")
	@Order(7)
	public void testCat() {
		Calculator calculator3 = new Calculator();
		Calculator calculator4 = new Calculator();
		Calculator calculator5 = new Calculator();

		calculator4 = null;
		calculator5 = null;
		int actual = calculator3.add(12, 8);
		int expected = 20;
		assertEquals(expected, actual);

	}

	@AfterAll
	public static void dd() {

	}
}