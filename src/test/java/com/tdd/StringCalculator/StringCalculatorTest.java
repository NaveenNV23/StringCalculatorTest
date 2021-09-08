package com.tdd.StringCalculator;


import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest 
{

	@Test
    public void ifEmptyReturnZero()
    {
    	StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0,stringCalculator.Add(""));
    }
	
	@Test
    public void addTwoNumbers()
    {
    	StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(3,stringCalculator.Add("1,2"));
    }
}
