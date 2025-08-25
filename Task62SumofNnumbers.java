package Leetcode;
import java.util.Scanner;
public class Task62SumofNnumbers {
	//Java program to sum of N numbers.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=0;i<=num;i++) {
			System.out.println("Enter number " + i + ":");
			int num2 = sc.nextInt();
			sum += num2;		
		}
		System.out.println("The sum of n number is :" + sum);
	}
}
