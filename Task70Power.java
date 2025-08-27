package Leetcode;

import java.util.Scanner;

public class Task70Power {
//70 Java Program to Calculate Power of Number.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scanner.nextInt();
		System.out.println("Enter the power value :");
		int pow = scanner.nextInt();
		double power = Math.pow(num, pow);
		System.out.println("The power of  " + num + " is " + power);
		scanner.close();
		
	}

}
