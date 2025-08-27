package Leetcode;

import java.util.Scanner;

public class Task66CompoundInterest {
//Java Program to calculate compound interest. 
//formula : p *(1+ rate/n ) ^ (n*time)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		double principal = scanner.nextDouble();
		System.out.println("Enter anual interest rate: ");
		double rate = scanner.nextDouble();
		System.out.println("Enter time period:");
		double time = scanner.nextDouble();
		System.out.println("Enter the no. of times interest is compunded per year:");
		int n = scanner.nextInt();
		double amt = principal * Math.pow((1 + rate / n), n * time);
		double interest = amt - principal;
		System.out.println("Principal amt :" + principal);
		System.out.println("annual interest rate :" + rate);
		System.out.println("Time period :" + time);
		System.out.println("Compound interest :" + interest);
		System.out.println("Amount after :" + time + "years :" + amt);
		scanner.close();
	}


}
