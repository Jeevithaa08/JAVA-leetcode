package Leetcode;

import java.util.Arrays;

public class Task20SumofArray {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5}; //integer is created and initialised with 1 to 5
		int sum = 0;
        
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum of the array values : " + sum);
	}

}
