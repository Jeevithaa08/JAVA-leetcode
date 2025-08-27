package Leetcode;

import java.util.Scanner;

public class Task67BattingAvg {
//Java Program to Calculate Batting Average. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of runs");
		int runs = sc.nextInt();
		System.out.println("Enter no of dismissals");
		int dismissals = sc.nextInt();
		double avg = runs / dismissals;
		System.out.println("the avg is " + avg);
		sc.close();
	}


}
