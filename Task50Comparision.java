package Leetcode;

import java.util.Scanner;

//Java program to compare two numbers. 
public class Task50Comparision {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the number 2 :");
		int num2 = scanner.nextInt();
		scanner.close();
		
		if(num1 > num2) {
			System.out.println("The num1 is greater");
		}else if(num1 < num2) {
			System.out.println("The num2 is greater");
		}else {
			System.out.println("The numbers are equal");
		}
	}

}
