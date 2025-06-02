package Leetcode;

import java.util.Scanner;

//Java program to convert all characters in a string to lowercase. 
public class Task16Lowercase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scanner.nextLine();
		String lowerCase = str.toLowerCase();
		System.out.println("Lowercase string :" +lowerCase);
		scanner.close();
		
	}

}
