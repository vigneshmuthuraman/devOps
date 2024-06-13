package com.aqm.validations.TestCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aqm.calculations.Calculator;

public class NewTest {
  @Test
  public void addTest() {
	  Calculator.add(5, 6);
	  Assert.assertEquals(Calculator.add(5, 6), 11);
  }
  
  
  @Test
  public void subTest() {
	  Calculator.add(5, 6);
	  Assert.assertEquals(Calculator.sub(5, 6), -1);
  }
}
