package Leetcode;
import java.util.Scanner;

//Java program that takes five numbers as input to calculate and print the average of the numbers.

public class Task5Average {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		double sum =0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Number" +(i+1)+ ":");
			sum +=scanner.nextDouble();
			
		}
		
		double average = sum/5;
		System.out.println("The Average is " +average);
		
		scanner.close();
		}
}
