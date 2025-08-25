package Leetcode;
import java.util.Scanner;
//Java program that accepts an integer (n) and computes the value of n+nn+nnn.
public class Task53IntCompute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a single digit integer :");
		int n = scanner.nextInt();
		scanner.close();
		if (n<0 || n>9) {
			System.out.println("Please enter a single digit integer .");
			return;
		}
		int nn = n * 10 + n;
		int nnn = n * 100 + nn;
		
		int sum = n + nn + nnn;
		System.out.println("The value of n + nn + nnn is : " + sum);
	}
}
