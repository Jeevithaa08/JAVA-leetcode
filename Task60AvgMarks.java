package Leetcode;

import java.util.Scanner;

//Java program to calculate average marks.
public class Task60AvgMarks {
	Scanner scanner = new Scanner(System.in); {
		System.out.println("Enter the number of the Subjects :");
		int numSubjects = scanner.nextInt();
		
		double sum = 0;
		
		for(int i = 1;i<=numSubjects; i++) {
			System.out.println("enter marksfor subjects " + i + ": ");
			double marks = scanner.nextDouble();
		}
		double average = sum / numSubjects;
		System.out.println("the average marks is: " + average);
	}
}
