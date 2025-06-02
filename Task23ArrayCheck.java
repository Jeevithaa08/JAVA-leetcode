package Leetcode;

public class Task23ArrayCheck {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		int target = 20; //sets a target as 20
		
		boolean found = false; //initialises a flag to track whetherbthe target is found or not
		for(int i = 0; i < array.length; i++){
			if(array[i] == target) {
				found = true;
				break;
			}
			
		}
		if(found) {
			System.out.println("Array contains " +target);
		}else {
			System.out.println("Array does not contain " +target);
		}
	}

}
