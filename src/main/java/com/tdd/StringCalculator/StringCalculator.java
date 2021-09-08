package com.tdd.StringCalculator;


public class StringCalculator 
{
	int Add(String numbers) {
		
		if(numbers.isBlank()) {
			return 0;
		}else{
			String[] num = numbers.split(",");
			if(num.length == 1){
				return Integer.parseInt(num[0]);
			}else{
	               return Integer.parseInt(num[0])+Integer.parseInt(num[1]);
			}
	    }
	}
	
    public static void main( String[] args )
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	System.out.println(stringCalculator.Add("1,2"));
    }
}
