package Leetcode;

import java.util.Scanner;
//Java program to print the ascii value of a given character. 
public class Task52AsciiValues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char c = scanner.next().charAt(0);
		scanner.close();
		int asciiValue = (int) c;
		System.out.println("The ASCII value of '" + c + "' is: " + asciiValue);
	}

}
