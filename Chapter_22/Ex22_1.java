/* Name: Paul Helske
 * Date: 07/31/2023
 */

import java.util.Scanner;

public class Ex22_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String longestSubstring = "";
		String currentSubstring =  "";
		String initialString = "";

		int counter = 0;

		Character lastChar;
		Character currentChar;

		System.out.println("Please enter a String of characters to process: ");
		initialString = input.next();
		
		for (int i = 1; i < initialString.length(); i++) {
			lastChar = initialString.charAt(i - 1);
			currentChar = initialString.charAt(i);
			
			if (currentChar > lastChar) {
				currentSubstring += "" + lastChar;
				counter = 0;
			}

			else if (currentChar <= lastChar) {
				if (counter < 1)
					currentSubstring += "" + lastChar;
				counter++;

				if (currentSubstring.length() > longestSubstring.length()) {
					longestSubstring = currentSubstring;
					currentSubstring = "";
				}
				else
					currentSubstring = "";
			}
		}
		System.out.println("Maximum consecutive substring is " + longestSubstring);
	}
}