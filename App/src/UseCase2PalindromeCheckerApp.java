/**
 * ================================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * Checks whether a hardcoded string is a palindrome
 * and prints the result.
 *
 * @author Lakshvanth
 * @version 2.0
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse logic
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Palindrome check using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}