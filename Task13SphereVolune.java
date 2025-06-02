package Leetcode;

import java.util.Scanner;

// Java Program to find volume of sphere. 

public class Task13SphereVolune {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the radius :");
	double r = scanner.nextDouble();
	double volume = (4.0/3) * Math.PI * r * r * r;
	System.out.println("Enter the volume of sphere :" +volume);
	scanner.close();
	
	
	
	

}
}
