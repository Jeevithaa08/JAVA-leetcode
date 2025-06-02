package Leetcode;

import java.util.Scanner;

public class Task19Replace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String str = scanner.nextLine();
		System.out.println("----------------------");
		String newStr = str.replace("d", "f");
		System.out.println("Original string :" +str);
		System.out.println("----------------------");
		System.out.println("After replacing d with f :" +newStr);
		System.out.println("----------------------");
	}

}
