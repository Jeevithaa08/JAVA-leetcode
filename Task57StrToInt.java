package Leetcode;
import java.util.Scanner;
//Java program to convert a string to an integer
public class Task57StrToInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scanner.nextLine();
		int num = Integer.parseInt(str);
		System.out.println("Converted integer : " +num);
		scanner.close();
		}
}