/**
 * ================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * Converts a string into a character array and checks palindrome
 * using two-pointer technique.
 *
 * @author Lakshvanth
 * @version 4.0
 */

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Convert to character array
        char[] characters = input.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {

            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // Output result
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome ✅");
        } else {
            System.out.println("Result : Not a Palindrome ❌");
        }
    }
}