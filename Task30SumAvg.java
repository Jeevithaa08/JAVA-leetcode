package Leetcode;

import java.util.Scanner;

public class Task30SumAvg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum =0;
		
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			sum += scanner.nextInt();
			
		}
		scanner.close();
		
		double average = (double) sum / 5;
		System.out.println("The sum of 5 numbers is :" + sum);
		System.out.println("The average is :" + average);
	

}
	}
