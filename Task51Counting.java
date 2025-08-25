package Leetcode;
import java.util.Scanner;
//Java program to count the letters, spaces, numbers, and other characters of an input string.
public class Task51Counting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String input = scanner.nextLine();
		scanner.close();
		int letters = 0;
		int spaces = 0;
		int numbers = 0;
		int otherChars = 0;
		for(char c : input.toCharArray()) {
			if(Character.isLetter(c)) {
				letters++;
			}else if(Character.isDigit(c)) {
				numbers++;
			}else if(Character.isWhitespace(c)) {
				spaces++;
			} else {
				otherChars++;
			}
		}
		System.out.println("Letters: " + letters);
		System.out.println("Spaces: " + spaces);
		System.out.println("Numbers: " + numbers);
		System.out.println("Other characters : " + otherChars);		
	}
}
