import java.util.*;

/**
 * Template code to help you parse the standard input 
 * according to the problem statement.
 **/
class Solution {
	
	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		// read values with in.next...() methods
		String input = in.nextLine();
		// code your solution here
		boolean output = isInputWellFormed(input);
		// Write result with System.out.println()
		System.out.println( output );
	}

	private static boolean isInputWellFormed(String input) {
		HashMap<Character, Character> validPairs = new HashMap<>();
		validPairs.put('{', '}');
		validPairs.put('(', ')');
		validPairs.put('[', ']');

		Deque<Character> unmatchedChars = new ArrayDeque<>();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			if (validPairs.keySet().contains(currentChar)) {
				unmatchedChars.push(currentChar); // Add only opening ({[ to the unmatchedChars.
			} else if (validPairs.values().contains(currentChar)) {
				if (!unmatchedChars.isEmpty() && validPairs.get(unmatchedChars.peekFirst()) == currentChar) {
					unmatchedChars.pop(); // Match found, empty the unmatchedChars.
				} else {
					return false;
				}
			}
		}
		return unmatchedChars.isEmpty();
	}
}
