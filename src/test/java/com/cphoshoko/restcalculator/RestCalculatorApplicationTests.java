package com.cphoshoko.restcalculator;

import com.cphoshoko.restcalculator.Controller.CalculatorController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RestCalculatorApplicationTests {

	@Test
	public void contextLoads(){}

	@Autowired
	private CalculatorController calculatorController;

	@Test
	void testCalculationMethods(){
		assertEquals(25, calculatorController.add(10,15));
		assertEquals(5, calculatorController.divide(10,2));
		assertEquals(50, calculatorController.multiply(10,5));
		assertEquals(-5, calculatorController.subtract(10,15));
	}

}
