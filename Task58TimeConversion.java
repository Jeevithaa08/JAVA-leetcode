package Leetcode;

import java.util.Scanner;

//Java program to convert seconds to hour, minute, and seconds.
public class Task58TimeConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of seconds : ");
		int seconds = scanner.nextInt();
		scanner.close();
		
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		int remainingSeconds = seconds % 60;
		
		System.out.println(seconds + " seconds is equal to " + hours + "hours. " + minutes + "minutes, and " + remainingSeconds + "seconds.");
		
	}

}
