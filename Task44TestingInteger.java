package Leetcode;
//Java program to test if a double number is an integer. 

public class Task44TestingInteger {
	public static void main(String[] args) {
		double number = 234.0;
		
		if(isInteger(number)) { //isInteger is a method to test if the number is an integer
			//this method checks if the remainder of the number divided by 1 is 0, if it is, the number is an integer
			
			
			System.out.println(number + "is an Integer");
		}	else {
				System.out.println(number + "is not an Integer");
				
			}
		}
		public static boolean isInteger(double number) {
			return number % 1 == 0; //returns the remainder of the division of the number by 1
			//divided by 0 = integer, not divided by 0 = non-integer
		}
	}


