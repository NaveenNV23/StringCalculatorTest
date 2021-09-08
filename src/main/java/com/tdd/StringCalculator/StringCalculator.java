package com.tdd.StringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator 
{
	
	int Add(String numbers) {
		
	    String delimiter = ",|\n";
	    String delimeterRemovedNumbers = numbers;
	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("//") + 2;
	        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
	        delimeterRemovedNumbers = numbers.substring(numbers.indexOf("n") + 1);
	    }
	    return Add(delimeterRemovedNumbers, delimiter);
	    
	}
	 
	int Add(String numbers, String delimiter) {
		
		int value = 0;
	    String[] arrayOfNumbers = numbers.split(delimiter);
	    List negativeValues = new ArrayList();
	    for (String number : arrayOfNumbers) {
	        if (!number.trim().isEmpty()) {
	            int integerNumber = Integer.parseInt(number.trim());
	            if (integerNumber < 0) {
	                negativeValues.add(integerNumber);
	            }
	            value += integerNumber;
	        }
	    }
	    if (negativeValues.size() > 0) {
	        throw new RuntimeException("Negative numbers are not allowed: " + negativeValues.toString());
	    }
	    return value; 
	}
	
    public static void main( String[] args )
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	System.out.println(stringCalculator.Add("5,-3,14,-12,37,21"));
    }
}
