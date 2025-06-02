package Leetcode;

import java.util.Scanner;

//Java Program to find volume of cylinder. 

public class Task14CylinderVolume {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius :");
		double r = scanner.nextDouble();
		System.out.println("Enter the height :");
		double h = scanner.nextDouble();
		double volume = Math.PI * r * r * h;
		System.out.println("Enter the volume :" +volume);
		scanner.close();
		
	}

}
