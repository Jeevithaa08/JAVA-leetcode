package Leetcode;

import java.util.Scanner;

public class Task26Days {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month(1-12): ");
		int month = scanner.nextInt();
		

		System.out.println("Enter year: ");
		int year = scanner.nextInt();
		
		if(month == 2) {
			if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
				System.out.println("29 days");
			}else {
				System.out.println("28 days");
		}
	} else if (month == 4 || month == 6 || month == 9 || month == 11) {
		System.out.println("30 days");
	} else {
		System.out.println("31 days");
	}
		
    scanner.close();
}}
