package Leetcode;

public class Task22AvgofArray {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		int sum = 0;  //initialises a variable to store the sum values
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];  //adds current element to sum
			
		}
		double average = (double) sum / array.length;  //average calculation
		System.out.println("Average value :" +average);
	}

}
