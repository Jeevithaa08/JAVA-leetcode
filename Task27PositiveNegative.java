package Leetcode;

import java.util.Scanner;

public class Task27PositiveNegative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		double number = scanner.nextDouble();
		scanner.close();
		
		if (number > 0)
			System.out.println(number + "is positive number");
		else if (number < 0)
			System.out.println(number + "is negative number");
		else
			System.out.println(number + "is 0.");
		
		
	}

}
