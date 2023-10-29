// Java Program to Convert a String to Character Array
// Using Naive Approach

// Importing required classes
import java.util.*;

// Class
public class GFG {

	// Main driver method
	public static void main(String args[])
	{

		// Custom input string
		String str = "GeeksForGeeks";

		// Creating array of string length
		// using length() method
		char[] ch = new char[str.length()];

		// Copying character by character into array
		// using for each loop
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		// Printing the elements of array
		// using for each loop
		for (char c : ch) {
			System.out.println(c);
		}
	}
}
