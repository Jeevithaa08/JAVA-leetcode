package Leetcode;

import java.util.Scanner;

//Java method to compute the average of three numbers. 
public class Task36Avg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); {
			System.out.println("Enter the number 1 :");
			double num1 = scanner.nextDouble();
			
			System.out.println("Enter the number 2 :");
			double num2 = scanner.nextDouble();
			
			System.out.println("Enter the number 3 :");
			double num3 = scanner.nextDouble();
			
			double average = (num1 + num2 + num3) / 3;
			System.out.println("The average of 3 numbers are :" + average);
			scanner.close();
		}
	}

}
