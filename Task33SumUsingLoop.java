package Leetcode;
//Java program to calculate the sum of first 10 natural number using loop. 

public class Task33SumUsingLoop {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum += i;  //sum = sum + i
		}
		System.out.println("The sum of first 10 natural numbers are :" +sum);

	}

}
