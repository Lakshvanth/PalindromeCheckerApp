/**
 * ================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * Uses Deque to compare front and rear elements
 * without using separate reversal structures.
 *
 * @author Lakshvanth
 * @version 7.0
 */

import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome ✅");
        } else {
            System.out.println("Result : Not a Palindrome ❌");
        }
    }
}