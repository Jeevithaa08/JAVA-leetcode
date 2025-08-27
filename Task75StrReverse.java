package Leetcode;

import java.util.Scanner;

public class Task75StrReverse {
//Write a java program to reverse a String.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = scanner.nextLine();
		
//StringBuilder is a class which is a mutable sequence of characters
//reverse() is method reverses characters in StringBuilder
//toString() is method convert it back to a string
		
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println("The reversed string is :" + rev);
		scanner.close();
	}
}
