package Leetcode;
//Java program to trim a string (remove whitespaces). 

import java.util.Scanner;

public class Task17Trim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scanner.nextLine();
		String trimmed = str.trim();
		System.out.println("Trimmed string :" +trimmed);
		scanner.close();
	}
}