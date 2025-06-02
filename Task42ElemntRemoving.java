package Leetcode;
//Java program to remove the third element from an array list. 

import java.util.ArrayList;

public class Task42ElemntRemoving {
	public static void main(String[] args) {
		// creating a new arraylist
				ArrayList<String> collection = new ArrayList<>();
				
				//adding some string elements to the collection
				collection.add("Apple");
				collection.add("Orange");
				collection.add("Mango");
				collection.add("Watermelon");
				
				//printing the collection
				System.out.println("Collection :" + collection);
				
				//removing 
				collection.remove(3);
				System.out.println("After removal :" +collection);
	}

}
