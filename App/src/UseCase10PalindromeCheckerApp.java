/**
 * ================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * Normalizes string using regex,
 * ignores spaces and case,
 * then checks palindrome using two-pointer approach.
 *
 * @author Lakshvanth
 * @version 10.0
 */

public class UseCase10PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        // Normalize string (remove spaces & special chars, convert to lowercase)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("Original Input : " + input);

        if (isPalindrome(input)) {
            System.out.println("Result : It is a Palindrome ✅");
        } else {
            System.out.println("Result : Not a Palindrome ❌");
        }
    }
}