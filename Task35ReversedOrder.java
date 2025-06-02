package Leetcode;

import java.util.Scanner;

// Java program that prompts the user to input an integer and then outputs the number with the digits reversed order. 

public class Task35ReversedOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integer :");
		int num = scanner.nextInt();
		scanner.close();
		
		int reversed = 0; //Stores a result in this variable
		while(num !=0) { //loops until the original number num becomes 0 {
		int digit = num % 10;  //extracts the last digit of the number using modulo operator (ex: 1234 ,starts with 4)
		reversed = reversed * 10 +digit;//adds the extracted digit to the reversed number
		num /= 10; //removes the last digit from the original number using division (/=) (Ex = if 1234, thhe 321)
	}
	System.out.println("The reversed number is " + reversed);

  }
}