package Leetcode;

import java.util.Scanner;
//Java program to check vowel or consonant.
public class Task61CheckingVowelConst {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a char :");
		char ch = scanner.next().charAt(0);
		if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Vowels");
			
		}else if(ch>='a' && ch<='z') {
			System.out.println("Constant");
		
		}else {
			System.out.println("not a letter");
		}
		scanner.close();
	}

}
