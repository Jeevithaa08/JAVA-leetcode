//Java Program to find area of equilateral triangle. 
package Leetcode;

import java.util.Scanner;

public class Task9EquiTriangleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length :");
		double side = scanner.nextDouble();
		double area = (Math.sqrt(3) / 4) * side * side;
		System.out.println("Area of the Equilateral Triangle is :" +area);
		scanner.close();
		
	}
}
