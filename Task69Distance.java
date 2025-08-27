package Leetcode;

import java.util.Scanner;

public class Task69Distance {
//Java Program to Find Distance Between Two Points. 
// formula : sqrt((x2-x1)^2 + (y2-y1)^2)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 coordinate ");
		double x1 = scanner.nextDouble();
		System.out.println("Enter x2 coordinate ");
		double y1 = scanner.nextDouble();
		System.out.println("Enter y1 coordinate ");
		double x2 = scanner.nextDouble();
		System.out.println("Enter y2 coordinate ");
		double y2 = scanner.nextDouble();
		double distance = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
		System.out.println("The distance between the two point is :" + distance);
		
       scanner.close();
	}

}
