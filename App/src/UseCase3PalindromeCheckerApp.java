/**
 * ================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * Reverses a string using a loop and checks if it is a palindrome.
 *
 * @author Lakshvanth
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded String
        String original = "madam";
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display original and reversed
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Check palindrome
        if (original.equals(reversed)) {
            System.out.println("Result : It is a Palindrome ✅");
        } else {
            System.out.println("Result : Not a Palindrome ❌");
        }
    }
}