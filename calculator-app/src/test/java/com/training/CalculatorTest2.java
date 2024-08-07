package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

class CalculatorTest2 {

	Calculator calculator;
	int expected = 0;
	int actual = 0;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("OFSS TESTING STARTED");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("OFSS TESTING ENDED");
		System.gc();
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("##Setup called");
		calculator = new Calculator();
		expected = 20;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("##Teardown called");
		expected = 0;
		actual = 0;
		calculator = null;
	}

	@Test
	void testAdd1() {
		System.out.println("### Test Add1 called");
		actual = calculator.add(10, 10);
		assertEquals(expected, actual);

	}

	@Test
	void testAdd2() {
		System.out.println("### Test Add2 called");
		expected = 12;
		actual = calculator.add(5, 7);
		assertEquals(expected, actual);
	}


	void testAdd3() {
		System.out.println("### Test Add3 called");
		expected = 12;
		actual = calculator.add(5, 7);
		assertEquals(expected, actual);

	}

	@Test
	void testconvertStringToNumber1() {
		System.out.println("### Test testconvertStringToNumber called");
		actual = calculator.convertStringToNumber("90");
		assertEquals(90, actual);
	}

	@Test
	@DisplayName("Testing convert to numbers \"Twenty\" ")
	void testconvertStringToNumber2() {
		expected = 20;
		System.out.println("### Test testconvertStringToNumber called");
		assertThrows(NumberFormatException.class, () -> {
			int actual = calculator.convertStringToNumber("20");
			assertEquals(expected, actual);
		});
	}
}
