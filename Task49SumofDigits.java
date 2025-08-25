package Leetcode;

import java.util.Scanner;

//Java program and compute the sum of the digits of an integer. 
public class Task49SumofDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer :");
		int num = scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		while(num !=0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("Sum of digits :" + sum);
	}

}
