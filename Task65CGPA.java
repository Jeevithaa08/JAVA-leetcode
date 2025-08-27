package Leetcode;

import java.util.Scanner;

public class Task65CGPA {
//Java Program to Calculate CGPA Percentage. 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter CGPA :");
		double cpga = scanner.nextDouble();
		double percentage = cpga * 9.5;
		System.out.println("CGPA :" + cpga);
		System.out.println("Percentage :" +percentage);
		scanner.close();
	}
}
