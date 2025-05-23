package Leetcode;

import java.util.Scanner;

//Java program to concatenate two strings. 
public class Task15Concatenation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string 1 :");
		String str1 = scanner.nextLine();
		System.out.println("Enter the string 2 :");
		String str2 = scanner.nextLine();
		
		String result = str1 + str2;
		System.out.println("Enter the concatenated string :" +result);
		scanner.close();
		
		
	}

}
