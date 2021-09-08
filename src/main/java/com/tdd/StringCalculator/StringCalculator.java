package com.tdd.StringCalculator;


public class StringCalculator 
{
	int Add(String numbers) {
		
		if(numbers.isBlank()) {
			return 0;
		}else{
			return 1;
	    }
	}
	
    public static void main( String[] args )
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	System.out.println(stringCalculator.Add(""));
    }
}
