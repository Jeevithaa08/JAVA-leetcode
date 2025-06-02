package Leetcode;
//Java program to insert an element into the array list at the first position. 

import java.util.ArrayList;

public class Task41ElementArray {
	public static void main(String[] args) {
ArrayList<String> collection = new ArrayList<>();
		
		//adding some string elements to the collection
		collection.add("Apple");
		collection.add("Orange");
		collection.add("Mango");
		collection.add("Watermelon");
		
		//printing the collection
		System.out.println("Before insertion :" + collection);
		
		collection.add(0, "Strawberry");
		System.out.println("After insertion :" + collection);
	}

}
