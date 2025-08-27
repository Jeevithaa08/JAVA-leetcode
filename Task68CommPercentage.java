package Leetcode;

import java.util.Scanner;

public class Task68CommPercentage {
//Java Program to Calculate Commission Percentage
//formula : (salesamt * comm %)/100
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salesamount");
		double amt = sc.nextDouble();
		System.out.println("Enter commission percentage");
		double comm = sc.nextDouble();
		double ans = (amt*comm)/100;
		System.out.println("The commission percentage " + ans);
		
		sc.close();
	}
}
