package Leetcode;

import java.util.Scanner;

public class Task64ElectricityBill {
	
//Java Program to calculate electricity bill.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units:");
		double units = sc.nextDouble();
		double rate1 = 2.50;
		double rate2 = 3.00;
		double rate3 = 3.50;
		
		double bill;
		if(units <= 100) {
			bill = units * rate1;
			
		}else if(units <= 200) {
			bill = 100 * rate1 + (units - 100) * rate2;
			
		}else {
			bill = 100 * rate1 + 100 * rate2 + (units - 200) * rate3;
		}
		bill *= 1.10;//add a 10% surcharge
		System.out.println("Your electricity bill is :" + String.format("%.2f", bill));
		
		sc.close();}
}
