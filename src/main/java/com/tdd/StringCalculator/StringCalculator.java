package com.tdd.StringCalculator;


public class StringCalculator 
{
	int Add(String numbers) {
		
		if(numbers.isBlank()) {
			return 0;
		}else{
			
			int total = 0;
			String[] num = numbers.split(",|\n");
	        for(String str: num){
	            total+= Integer.parseInt(str);
	        }
	        return total;
	        
	    }
	}
	
    public static void main( String[] args )
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	System.out.println(stringCalculator.Add("1\n2,3"));
    }
}
