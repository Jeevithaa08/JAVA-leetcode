package Leetcode;
import java.util.Scanner;

public class Task6Circlearea {    //Java program to find area of circle
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius = scanner.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("The area of the cricle is :" +area);
		scanner.close();
		}

}
