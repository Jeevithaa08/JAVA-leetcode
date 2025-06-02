package Leetcode;

import java.util.Scanner;

public class Task25Greatest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the second number :");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter the third number :");
		int num3 = scanner.nextInt();
		
		int greatest = Math.max(Math.max(num1, num2), num3);  //finds max of 1,2 and then compares the result with 3
		System.out.println("The greatest number is :" + greatest);
		scanner.close();
		
	}

}
