package Leetcode;

import java.util.Scanner;

//Java method to find the smallest number among three numbers. 

public class Task37FindingSmallest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the number 2 :");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter the number 3 :");
		int num3 = scanner.nextInt();
		
		int smallest = findSmallest(num1, num2, num3);
		System.out.println("The smallest number amoung the three numbers are :" + smallest);
		scanner.close();
		
		
		
	}
	public static int findSmallest(int num1, int num2, int num3) {
		return Math.min(Math.min(num1,  num2), num3);
	}

}
