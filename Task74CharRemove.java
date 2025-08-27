package Leetcode;

import java.util.Scanner;

public class Task74CharRemove {
//Write a java program to remove a particular character from a string.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the str :");
		String str = scanner.nextLine();
		System.out.println("Entert the char to remove ");
		char c = scanner.next().charAt(0); //read the character input
		
	//"" for replacing the removed one with spaces
		String result = str.replace(String.valueOf(c), ""); //remove the char from the str
		System.out.println("string after removing " + c + " : " + result);
			
			scanner.close();
		}
	}