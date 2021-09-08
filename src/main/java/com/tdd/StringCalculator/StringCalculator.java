package com.tdd.StringCalculator;

import java.util.regex.Pattern;

public class StringCalculator 
{
	
	int Add(String numbers) {
		
		String delimiter = "[,|\n]+";
		if(Pattern.compile("^//").matcher(numbers).find()){
			delimiter = Character.toString(numbers.charAt(2));
			numbers = numbers.substring(4);
			}
		String[] num = numbers.split(delimiter);
		int sum = 0;
		for(int i=0;i<num.length;i++){
			if(isNumber(num[i])){
				sum += Integer.parseInt(num[i]);
			}
		}
		return sum;
		
	}
	
	boolean isNumber(String num){
		try{
			int n = Integer.parseInt(num);
			}
		catch(NumberFormatException err){
			return false;
			}
		return true;
	}
	
    public static void main( String[] args )
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	System.out.println(stringCalculator.Add("//;\n5;3"));
    }
}
