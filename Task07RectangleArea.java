package Leetcode;

import java.util.Scanner;

public class Task7RectangleArea {  //Java Program to find area of rectangle
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length");
		double length = scanner.nextDouble();
		System.out.println("Enter the Breadth");
		double breadth = scanner.nextDouble();
		double area = length * breadth;
		System.out.println("The area of the Rectangle is: " +area);
		scanner.close();
	}

}
