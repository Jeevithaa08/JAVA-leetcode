package Leetcode;

import java.util.Scanner;

//Java Program to find area of Prism. Surface area = 2*(area of base) + (perimeter of base * height)

public class Task12PrismArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length :");
		double length = scanner.nextDouble();
		System.out.println("Enter the width: ");
		double width = scanner.nextDouble();
		System.out.println("Enter the height :");
		double height = scanner.nextDouble();
		
		double baseArea = length * width;
		double perimeter = 2 * (length + width);
		double surfaceArea = 2 * baseArea + perimeter * height;
		
		System.out.println("Enter the area :" + surfaceArea);
		scanner.close();
		
		
	}

}
