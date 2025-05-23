package Leetcode;
// Java Program to find area of parallelogram. (b*h)

import java.util.Scanner;

public class Task11ParalleogramArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base: ");
		double base = scanner.nextDouble();
		System.out.println("Enter the height :");
		double height = scanner.nextDouble();
		double area = base * height;
		System.out.println("Enter the area of the paralellogram :" +area);
		scanner.close();
		
			
		}
}


