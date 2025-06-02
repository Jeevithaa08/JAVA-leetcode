package Leetcode;
// Java method to count all words in a string. 

public class Task38CountingWords {
	public static void main(String[] args) {
		 String str = "Hello everyone, Welcome";
		 String[] words = str.split("\\s+"); //splits the string into an array of words, using one or more  whitespace characters (//s+) as delimiter
		 int wordCount =  words.length; //gives no. of words in array
		 System.out.println("Number of words :" +wordCount);
	}

}
