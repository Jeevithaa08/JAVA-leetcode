package Leetcode;
import java.util.Scanner;
public class Task63Factorial {
	//Java program to find factorial of any number. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		long factorial = 1;
		if(num <0) {
			System.out.println("factorial is not defined for negitive values");
			}else {
				for(int i = 1;i<=num;i++) {
					factorial *=i;
				}
				System.out.println("The factorial of " +num+ " is:" + factorial);
			}	
		sc.close();
		}

}