/**
 * ================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Dynamically selects palindrome checking strategy
 * using Interface + Polymorphism.
 *
 * @author Lakshvanth
 * @version 12.0
 */

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

/* ================================
   Strategy Interface
   ================================ */
interface PalindromeStrategy {
    boolean check(String input);
}

/* ================================
   Stack Strategy Implementation
   ================================ */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/* ================================
   Deque Strategy Implementation
   ================================ */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

/* ================================
   Context Class
   ================================ */
class PalindromeContext {

    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}

/* ================================
   Main Application
   ================================ */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeContext context = new PalindromeContext();

        // Choose Strategy at Runtime
        context.setStrategy(new StackStrategy());
        boolean resultStack = context.executeStrategy(input);

        context.setStrategy(new DequeStrategy());
        boolean resultDeque = context.executeStrategy(input);

        System.out.println("Input: " + input);
        System.out.println("Stack Strategy Result  : " + resultStack);
        System.out.println("Deque Strategy Result  : " + resultDeque);
    }
}