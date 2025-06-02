package Leetcode;

import java.text.DecimalFormat;

//Java program to round a float number to specified decimals. 

public class Task43FloatNumber {
	public static void main(String[] args) {
		float number = 234.57483f;
		
		int decimalPlaces=2; //int variable to define with the value 2
		
		DecimalFormat df = new DecimalFormat("#." + "#" .repeat(decimalPlaces)); //pattern to take from .## 
		String roundedNumber = df.format(number); 
		
		System.out.println("Original number :" + number);
		System.out.println("Rounded Number :" + roundedNumber);
	}

}
