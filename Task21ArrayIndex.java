package Leetcode;

public class Task21ArrayIndex {
	public static void main(String[] args) {
		int[] array= {10, 20, 30, 40, 50};
		int target = 40;
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				System.out.println("Element found at index" +i);
				return;
			}
			System.out.println("Elemnet not found");
		}
	}

}


