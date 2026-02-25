/**
 * ================================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * Uses recursion to compare first and last characters
 * until the base condition is reached.
 *
 * @author Lakshvanth
 * @version 9.0
 */

public class UseCase9PalindromeCheckerApp {

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "level";

        System.out.println("Input String : " + input);

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("Result : It is a Palindrome ✅");
        } else {
            System.out.println("Result : Not a Palindrome ❌");
        }
    }
}