package Leetcode;
// Java method to compute the sum of the digits in an integer. 

public class Task39SumofDigits {
	public static void main(String[] args) {
		int num = 4673826;
		int sum = sumOfDigits(num);
		System.out.println("The sum of digits :" +sum);
	}
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
	return sum;
	}
}
