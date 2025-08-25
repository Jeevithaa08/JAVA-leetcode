package Leetcode;

import java.util.Scanner;

// Java program to convert a decimal number to binary numbers. 

public class Task46DecimalToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a decimal number :");
	    int decimal = scanner.nextInt();
	    scanner.close();
	    
	    String binary = decimalToBinary(decimal);
	    System.out.println("Binary representation :" +binary);
	    
	}
	public static String decimalToBinary(int decimal) {
		if (decimal == 0) {
			return "0";
			
		}
		StringBuilder binary = new StringBuilder();
		while(decimal > 0) {
			binary.insert(0, decimal % 2);
			decimal /=2;
		}
		return binary.toString();
	}

}
