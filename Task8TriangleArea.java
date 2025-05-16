package Leetcode;

import java.util.Scanner;

public class Task8TriangleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Base :" );
		double base = scanner.nextDouble();
		System.out.println("Enter the height :");
		double height = scanner.nextDouble();
		double area = 0.5 * base * height;
		System.out.println("The area of the triangle is :" +area);
		scanner.close();
	}
}
