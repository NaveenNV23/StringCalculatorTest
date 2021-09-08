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
	
	@Test
    public void addMultipleNumbers()
    {
    	StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(10,stringCalculator.Add("1,2,3,4"));
    }
	
	@Test
    public void handleNewLinesBetweenNumbers()
    {
    	StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(6,stringCalculator.Add("1\n2,3"));
    }

}
