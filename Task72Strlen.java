package Leetcode;

import java.util.Scanner;

public class Task72Strlen {
//Write a java program to get the length of a given string. 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the str :");
		String str = scanner.nextLine();
		int length = str.length();
		System.out.println("The str len is :" + length);
		scanner.close();
		
	}

}
