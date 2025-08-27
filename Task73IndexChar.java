package Leetcode;

import java.util.Scanner;

public class Task73IndexChar {
// Write a Java program to get the character at the given index within the String.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the str ");
		String str = scanner.nextLine();
		System.out.println("Enter the index :");
		int index = scanner.nextInt();
		try {
			char c= str.charAt(index); //get the char at specifies index
			System.out.println("Character at index " + index + " is " + c);
			
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("index out of range ");
			}
		scanner.close();
	}

}
