package Leetcode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//Java program to display the system time. 
public class Task54SystemTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now(); //now = method , LocalTime = class
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); //DateTimeFormatter = object with hour:min:sec pattern
		String formattedTime = time.format(formatter); //formats the time according to the specified pattern using the format() method
		System.out.println("Current system time :" + formattedTime);
	}
}