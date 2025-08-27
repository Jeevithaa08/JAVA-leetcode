package Leetcode;

import java.util.Scanner;

public class Task76RemoveTags {
//Write a java program to remove html tags from a string. 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  the string with HTML tags :");
		String str = scanner.nextLine();
//replaceAll() is a method with a regular expresion to remove the given ones in string
		String remove = str.replaceAll("\\<.*?\\>", "");
		System.out.println("The str without html tags  " + remove);
		scanner.close();
	}


}
