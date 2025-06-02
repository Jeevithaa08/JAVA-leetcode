package Leetcode;

public class Task24MaxMinofArray {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		
		//initialises the max min with the first element of array
		int max = array[0]; 
		int min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("The maximun value :" +max);
		System.out.println("The minimum value :" +min);
			
		
		}

}
