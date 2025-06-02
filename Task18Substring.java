package Leetcode;
import java.util.Scanner;

public class Task18Substring {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();

	        System.out.print("Enter start index: ");
	        int start = scanner.nextInt();

	        System.out.print("Enter end index: ");
	        int end = scanner.nextInt();

	        System.out.println("Substring: " + str.substring(start, end));
	    }
}

