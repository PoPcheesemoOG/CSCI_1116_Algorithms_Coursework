/* Name: Paul Helske
 * Date: 08/09/2023
 */

// The time complexity of this program is O(n)

import java.util.*;

public class Ex22_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String string1 = "";
		String string2 = "";
		
		System.out.println("Enter a string to test against: ");
		string1 = input.nextLine();
		System.out.println("Enter a string to test with: ");
		string2 = input.nextLine();
		
		long time = System.nanoTime();
		
		if (string1.contains(string2) == true) {
			for (int i = 0; i < string1.length(); i++) {
				string1.startsWith(string2, i);
				if (string1.startsWith(string2, i) == true) {
					System.out.println("matched at index " + i);
				}
			}
		}
		else
			System.out.println("Strings do not match");
		long deltaTime = System.nanoTime() - time;
		System.out.println("time it took to complete program in nanoseconds: " + (deltaTime));
	}

}