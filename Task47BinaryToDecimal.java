package Leetcode;

import java.util.Scanner;

//Java program to convert a binary number to decimal number. 

public class Task47BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the binary number :");
		int binary = scanner.nextInt();
		scanner.close();
		
		String decimal = binaryToDecimal(binary);
		System.out.println("Decimal representation :" +decimal);
		
		
	}
	public static String binaryToDecimal(int binary) {
		if(binary == 0) {
			return "0";
		}
		StringBuilder decimal = new StringBuilder();
		while(binary>0) {
			decimal.insert(0, binary%2);
			binary /= 2;
		}
		return decimal.toString();		
	}
}
