package Leetcode;
// Java program to find the factorial value of any number entered through the keyboard. 

import java.util.Scanner;

public class Task34Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scanner.nextInt();
		scanner.close();
	 
	    long factorial = 1;	//Variable used to store the factorial calculation
	    for(int i = 1;i<= num;i++) {
		   factorial *= i;
	    }
	    System.out.println("The factorial of" + num +"is" + factorial);

    }
}