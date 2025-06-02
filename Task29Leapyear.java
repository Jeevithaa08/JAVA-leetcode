package Leetcode;

import java.util.Scanner;

public class Task29Leapyear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		scanner.close();
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println(year + " is a Leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
	}

}
